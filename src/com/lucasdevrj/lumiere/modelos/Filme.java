package com.lucasdevrj.lumiere.modelos;

public class Filme {

    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double avaliacao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int classificacao;
    public int duracaoEmMinutos;

    public int getClassificacao() {
        classificacao = (int) somaDasAvaliacoes / totalDeAvaliacoes;
        return classificacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avaliaFilme(double nota) {
        avaliacao = nota;
        somaDasAvaliacoes += avaliacao;
        totalDeAvaliacoes++;
    }

}
