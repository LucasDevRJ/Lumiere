package com.lucasdevrj.lumiere.excecoes;

public class ErroDeCaractereInvalidoException extends RuntimeException {

    private String mensagem;

    public ErroDeCaractereInvalidoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
}
