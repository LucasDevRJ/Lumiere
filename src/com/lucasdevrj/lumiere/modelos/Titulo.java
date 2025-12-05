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
    private String elenco;
    private String classificacaoIndicativa;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public int getAvaliacao() {
        avaliacao = somaDasAvaliacoes / totalDeAvaliacoes;
        return avaliacao;
    }

    public void exibirFichaTecnica() {
        System.out.println("--------------------|Informações sobre o Título|--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Sinopse: " + sinopse);
        String incluidoNoPlano = this.incluidoNoPlano == true ? "Sim" : "Não";
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        System.out.printf("Avaliação: %d de 10\n", getAvaliacao());
        System.out.println("Diretor: " + diretor);
        System.out.println("Elenco: " + elenco);
        System.out.println("Classificação Indicativa: " + classificacaoIndicativa);
    }

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
