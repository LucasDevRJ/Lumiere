package com.lucasdevrj.lumiere.modelos;

import java.time.LocalDate;

public class Filme {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int classificacao;
    private int duracaoEmMinutos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        int anoDoPrimeiroFilmeLancado = 1895;
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        if (anoDeLancamento >= anoDoPrimeiroFilmeLancado && anoDeLancamento <= anoAtual) {
            this.anoDeLancamento = anoDeLancamento;
        } else {
            System.out.println("Digite um ano de lançamento válido!");
        }
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getClassificacao() {
        classificacao = (int) somaDasAvaliacoes / totalDeAvaliacoes;
        return classificacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Classificação: " + getClassificacao() + " de 10");
        String incluidoNoPlano = getIncluidoNoPlano() == true ? "Incluído" : "Não Incluído";
        System.out.println("Incluído: " + incluidoNoPlano + " no seu Plano");
    }

    public void avaliaFilme(double nota) {
        avaliacao = nota;
        somaDasAvaliacoes += avaliacao;
        totalDeAvaliacoes++;
    }

}
