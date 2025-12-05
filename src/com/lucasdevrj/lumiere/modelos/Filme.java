package com.lucasdevrj.lumiere.modelos;

import java.time.LocalDate;

public class Filme {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int avaliacao;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int nota;
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

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getNota() {
        nota = somaDasAvaliacoes / totalDeAvaliacoes;
        return nota;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("--------------------|Informações sobre o Filme|--------------------");
        System.out.println("Nome: " + nome);
        System.out.printf("Nota: %d de 10\n", getNota());
        System.out.printf("Duração: %d minutos\n", duracaoEmMinutos);
        System.out.println("Ano da lançamento: " + anoDeLancamento);
        System.out.println("-------------------------------------------------------------------");
    }

    public void avaliaFilme(int nota) {
        if (nota > 0 && nota <= 10) {
            avaliacao = nota;
            somaDasAvaliacoes += avaliacao;
            totalDeAvaliacoes++;
        } else {
            System.out.println("Nota inválida!\nDigite uma nota entre 0 e 10.");
        }
    }

}
