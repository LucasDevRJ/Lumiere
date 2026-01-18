package com.lucasdevrj.lumiere.excecoes;

public class ErroDeValorVazioException extends RuntimeException {

    private String mensagem;

    public ErroDeValorVazioException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
