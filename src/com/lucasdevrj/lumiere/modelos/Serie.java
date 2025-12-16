package com.lucasdevrj.lumiere.modelos;

public class Serie extends Titulo {

    private int quantidadeDeTemporadas;
    private int quantidadeDeEpisodios;
    private boolean aindaEstaEmProducao;
    private int quantidadeDeMinutosPorEpisodio;
    private String criador;
    private String duracaoTotalDaSerie;

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
        int duracaoTotalEmMinutos = quantidadeDeEpisodios * quantidadeDeMinutosPorEpisodio;
        int duracaoHoras = duracaoTotalEmMinutos / 60;
        int duracaoMinutos = duracaoTotalEmMinutos % 60;
        return "%d horas e %d minutos".formatted(duracaoHoras, duracaoMinutos);
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

