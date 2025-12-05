package com.lucasdevrj.lumiere.modelos;

public class Serie extends Titulo {

    private int quantidadeDeTemporadas;
    private int quantidadeDeEpisodios;
    private int episodiosPorTemporada;
    private boolean aindaEstaEmProducao;
    private int quantidadeDeMinutosPorEpisodio;
    private String criador;

    public void setCriador(String criador) {
        this.criador = criador;
    }
}

