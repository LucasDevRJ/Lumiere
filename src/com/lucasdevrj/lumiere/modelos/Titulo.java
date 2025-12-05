package com.lucasdevrj.lumiere.modelos;

import java.util.List;

public class Titulo {

    private String nome;
    private String genero;
    private int anoDeLancamento;
    private String sinopse;
    private boolean incluidoNoPlano;
    private int avaliacao;
    private String diretor;
    private List<String> elenco;
    private double orcamento;
    private String classificacaoIndicativa;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public void avaliarTitulo(int avaliacao) {
        if (avaliacao > 0 && avaliacao <= 10) {
            this.avaliacao = avaliacao;
            somaDasAvaliacoes += this.avaliacao;
            totalDeAvaliacoes++;
            System.out.println("O Título foi avaliado com sucesso!");
        } else {
            System.out.println("Avaliação inválida! Digite uma nota entre 0 e 10.");
        }
    }
}
