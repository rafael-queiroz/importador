package com.logic.importador.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Arrays;

@Slf4j
public class ImportarArquivoService {

    public static void main(String[] args) {
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

                String conteudo = lerArquivo(arquivo);
                escreverArquivo(conteudo, arquivoDestino);
            }

            System.out.println("Tudo pronto.");
            System.exit(0);
        } else {
            System.out.println("Erro de I/O!!!");
            System.exit(1);
        }
    }

    private static String lerArquivo(File arquivo) {
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

    private static void escreverArquivo(String conteudo, File arquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            writer.write(conteudo);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
