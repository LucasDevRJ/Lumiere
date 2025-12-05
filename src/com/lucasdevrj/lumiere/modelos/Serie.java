package com.lucasdevrj.lumiere.modelos;

public class Serie {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int avaliacao;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int nota;
    private int duracaoTotalEmMinutos;
    private int duracaoTotalEmHoras;
    private int duracaoTotalEmMinutosRestantes;
    private int quantidadeDeTemporadas;
    private int quantidadeDeEpisodiosPorTemporada;
    private int totalDeMinutosPorEpisodio;
    private boolean estaAtiva;
    private int minutosPorEpisodio;

    public void setQuantidadeDeTemporadas(int quantidadeDeTemporadas) {
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    }

    public void setQuantidadeDeEpisodiosPorTemporada(int quantidadeDeEpisodiosPorTemporada) {
        this.quantidadeDeEpisodiosPorTemporada = quantidadeDeEpisodiosPorTemporada;
    }

    public void setTotalDeMinutosPorEpisodio(int totalDeMinutosPorEpisodio) {
        this.totalDeMinutosPorEpisodio = totalDeMinutosPorEpisodio;
    }

    public int getDuracaoTotalEmMinutos() {
        duracaoTotalEmMinutos = quantidadeDeTemporadas * quantidadeDeEpisodiosPorTemporada * totalDeMinutosPorEpisodio;
        return duracaoTotalEmMinutos;
    }

    public int getDuracaoTotalEmHoras() {
        duracaoTotalEmHoras = getDuracaoTotalEmMinutos() / 60;
        return duracaoTotalEmHoras;
    }

    public int getDuracaoTotalEmMinutosRestantes() {
        duracaoTotalEmMinutosRestantes = getDuracaoTotalEmMinutos() % 60;
        return duracaoTotalEmMinutosRestantes;
    }

    public int getNota() {
        nota = somaDasAvaliacoes / totalDeAvaliacoes;
        return nota;
    }

    public void exibeFichaTecnica() {
        System.out.println("--------------------|Informações sobre a Série|--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + getNota() + " de 10");
        System.out.println("Quantidade de temporadas: " + quantidadeDeTemporadas);
        System.out.printf("Duração: %d horas e %d minutos\n", getDuracaoTotalEmHoras(), getDuracaoTotalEmMinutosRestantes());
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("-------------------------------------------------------------------");
    }

    public void avaliaSerie(int nota) {
        if (nota > 0 && nota <= 10) {
            avaliacao = nota;
            somaDasAvaliacoes += avaliacao;
            totalDeAvaliacoes++;
        } else {
            System.out.println("Nota inválida!\nDigite uma nota entre 0 e 10.");
        }
    }
}

