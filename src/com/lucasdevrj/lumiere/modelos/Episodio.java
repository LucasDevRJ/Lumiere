package com.lucasdevrj.lumiere.modelos;

import com.lucasdevrj.lumiere.calculos.Classificavel;

public class Episodio implements Classificavel {

    private int numero;
    private int duracao;
    private String nome;
    private Serie serie;
    private int visualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie.getNome();
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Série: " + getSerie());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Número: " + getNumero());
        if (getClassificacao() == 1) {
            System.out.println("Está entre as Séries mais assistidas");
        }
    }

    @Override
    public int getClassificacao() {
        if (visualizacoes >= 10000) {
            return 1;
        }
        return 0;
    }
}
