package com.logic.importador.util;

import com.logic.importador.domain.GuiasPassageiros;
import org.springframework.stereotype.Component;

@Component
public class ArquivoUtil {

    public GuiasPassageiros gerarRegistro(String linha) {
        return GuiasPassageiros
                .builder()
                .versao(Long.parseLong(linha.substring(3, 5)))
                .build();
    }
}
