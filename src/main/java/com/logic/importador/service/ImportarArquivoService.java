package com.logic.importador.service;

import com.logic.importador.domain.GuiasPassageiros;
import com.logic.importador.repository.GuiasPassageirosRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
@EnableScheduling
public class ImportarArquivoService {

    static final String TIME_ZONE = "America/Sao_Paulo";

    @Autowired
    GuiasPassageirosRepository guiasPassageirosRepository;


    //@Scheduled(cron = "0 0/5 22,23 * * ?", zone = TIME_ZONE)
    @Scheduled(cron = "00 40 22 * * *", zone = TIME_ZONE)
    public void init() {
        // Altere essas variáveis segundo as suas necessidades
        final String urlDiretorioOrigem = "C:\\Documentos logic\\arquivos_brt\\UD_20200214";
        final String urlArquivoDestino = "C:\\Documentos logic\\arquivos_brt\\UD_20200214\\destino.txt";

        File diretorioOrigem = new File(urlDiretorioOrigem);
        File arquivoDestino = new File(urlArquivoDestino);

        if (!diretorioOrigem.isDirectory()) {
            System.out.println("A URL de origem não é um diretório ou o diretório não existe!!!");
            return;
        }

        File[] arquivos = diretorioOrigem.listFiles();

        if (arquivos != null) {
            Arrays.sort(arquivos);  // Deixar os arquivos em ordem alfabética

            for (File arquivo : arquivos) {
                if (arquivo.getAbsolutePath().equals(urlArquivoDestino)) {
                    // Pula a leitura do próprio arquivo de destino
                    continue;
                }

                //String conteudo = lerArquivo(arquivo);
                //escreverArquivo(conteudo, arquivoDestino);

                List<String> linhas = linhasPorArquivo(arquivo);
                linhas.forEach(linha -> {
                    GuiasPassageiros guiasPassageiros = gerarRegistro(linha);
                    guiasPassageirosRepository.save(guiasPassageiros);
                });
            }

            System.out.println("Tudo pronto.");
            System.exit(0);
        } else {
            System.out.println("Erro de I/O!!!");
            System.exit(1);
        }
    }

    static GuiasPassageiros gerarRegistro(String linha) {
        String l = linha.substring(3, 6);
        return GuiasPassageiros
                .builder()
                .versao(Long.parseLong(l))
                .build();
    }

    static String lerArquivo(File arquivo) {
        StringBuilder builder = new StringBuilder();
        String linha;

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            while ((linha = reader.readLine()) != null) {
                builder.append(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }

    static List<String> linhasPorArquivo(File arquivo) {
        List<String> linhas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String s = reader.readLine();
            while (s != null){
                linhas.add(s);
                s = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linhas;
    }

    static void escreverArquivo(String conteudo, File arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            writer.write(conteudo);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
