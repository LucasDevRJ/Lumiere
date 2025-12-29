package com.lucasdevrj.lumiere.modelos;

public class Serie extends Titulo {

    private int quantidadeDeTemporadas;
    private int quantidadeDeEpisodios;
    private boolean aindaEstaEmProducao;
    private int quantidadeDeMinutosPorEpisodio;
    private String criador;
    private String duracaoTotalDaSerie;

    public Serie() {

    }

    public Serie(String nome, int duracao, String genero) {
        super(nome, duracao, genero);
    }

    public void setQuantidadeDeTemporadas(int quantidadeDeTemporadas) {
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    }

    public void setQuantidadeDeEpisodios(int quantidadeDeEpisodios) {
        this.quantidadeDeEpisodios = quantidadeDeEpisodios;
    }

    public void setQuantidadeDeMinutosPorEpisodio(int quantidadeDeMinutosPorEpisodio) {
        this.quantidadeDeMinutosPorEpisodio = quantidadeDeMinutosPorEpisodio;
    }

    public void setAindaEstaEmProducao(boolean aindaEstaEmProducao) {
        this.aindaEstaEmProducao = aindaEstaEmProducao;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String aindaEstaEmProducao() {
        if (aindaEstaEmProducao == true) {
            return "Sim";
        }
        return "Não";
    }

    public String getDuracaoTotalDaSerie() {
        super.setDuracao(quantidadeDeEpisodios * quantidadeDeMinutosPorEpisodio);
        int duracaoHoras = super.getDuracao() / 60;
        int duracaoMinutos = super.getDuracao() % 60;
        String mensagemDuracao = duracaoMinutos > 0 ? "%d horas e %d minutos".formatted(duracaoHoras, duracaoMinutos) : "%d horas".formatted(duracaoHoras);
        return mensagemDuracao;
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Quantidade de temporadas: " + quantidadeDeTemporadas);
        System.out.println("Quantidade de episódios: " + quantidadeDeEpisodios);
        System.out.println("Minutos por episodio: " + quantidadeDeMinutosPorEpisodio);
        System.out.println("Duração total: " + getDuracaoTotalDaSerie());
        System.out.println("Em produção: " + aindaEstaEmProducao());
        System.out.println("Criador: " + criador);
        System.out.println("---------------------------------------------------------------------");
    }
}

