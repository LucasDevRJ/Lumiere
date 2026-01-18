package com.lucasdevrj.lumiere.modelos;

import com.lucasdevrj.lumiere.calculos.Classificavel;
import com.lucasdevrj.lumiere.excecoes.ErroDeCaractereInvalidoException;
import com.lucasdevrj.lumiere.excecoes.ErroDeValorVazioException;

public class Titulo implements Classificavel, Comparable<Titulo> {

    private String nome;
    private int duracao;
    private String genero;
    private int anoDeLancamento;
    private String sinopse;
    private boolean incluidoNoPlano;
    private int avaliacao;
    private String diretor;
    private String elenco;
    private int classificacaoIndicativa;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean estaAssistindo;
    private int visualizacoes;

    public Titulo() {

    }

    public Titulo(String nome, int duracao, String genero) {
        setNome(nome);
        setDuracao(duracao);
        setGenero(genero);
    }

    public Titulo(TituloOmdb tituloOmdb) {
        validaValorDaConversao(tituloOmdb);
        nome = tituloOmdb.title();
        anoDeLancamento = Integer.valueOf(tituloOmdb.year());
        duracao = Integer.valueOf(tituloOmdb.runtime().substring(0, 3).replaceAll(" ", ""));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getGenero() {
        return genero;
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

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        if (classificacaoIndicativa == 0 || classificacaoIndicativa == 10 || classificacaoIndicativa == 12
        || classificacaoIndicativa == 14 || classificacaoIndicativa == 16 || classificacaoIndicativa == 18) {
            this.classificacaoIndicativa = classificacaoIndicativa;
        }
    }

    public int getAvaliacao() {
        if (somaDasAvaliacoes > 0 && totalDeAvaliacoes > 0) {
            return avaliacao = somaDasAvaliacoes / totalDeAvaliacoes;
        }
        return 0;
    }

    public boolean getEstaAssistindo() {
        return estaAssistindo;
    }

    public void setEstaAssistindo(boolean estaAssistindo) {
        this.estaAssistindo = estaAssistindo;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public String getElenco() {
        return elenco;
    }

    public void exibirTitulo() {
        System.out.println("--------------------|Resumo sobre o Título|--------------------");
        System.out.println("Nome: " + nome);
        System.out.printf("Avaliação: %d de 10\n", getAvaliacao());
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Gênero: " + genero);
        System.out.println("---------------------------------------------------------------");
    }

    public String estaIncluidoNoPlano() {
        if (incluidoNoPlano) {
            return "Sim";
        }
        return "Não";
    }

    public String indicadoSomenteParaMaioresDeIdade() {
        if (classificacaoIndicativa == 18) {
            return "Título recomendado somente para maiores de 18 anos.";
        }
        return "";
    }

    public void exibirFichaTecnica() {
        System.out.println("--------------------|Informações sobre o Título|--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Incluído no plano: " + estaIncluidoNoPlano());
        System.out.printf("Avaliação: %d de 10\n", getAvaliacao());
        System.out.println("Diretor: " + diretor);
        System.out.println("Elenco: " + elenco);
        String indicacao = classificacaoIndicativa == 0 ? "Livre" : classificacaoIndicativa + " anos";
        System.out.println("Classificação Indicativa: " + indicacao);
        System.out.print(indicadoSomenteParaMaioresDeIdade());
        String classificacao = getClassificacao() > 0 ? "Classificação: " + getClassificacao() + " lugar entre os 3 mais assistidos" : "Não esta entre os TOP 3";
        System.out.println(classificacao);
    }

    public void avaliarTitulo(int avaliacao) {
        if (avaliacao > 0 && avaliacao <= 10) {
            this.avaliacao = avaliacao;
            somaDasAvaliacoes += this.avaliacao;
            totalDeAvaliacoes++;
            System.out.println("O título '" + nome + "' foi avaliado com sucesso!");
        } else {
            System.out.println("Avaliação inválida! Digite uma nota entre 0 e 10.");
        }
    }

    public void zerarAvaliacoes() {
        avaliacao = 0;
        somaDasAvaliacoes = 0;
        totalDeAvaliacoes = 0;
        System.out.println("Avaliações foram zeradas.");
    }

    public boolean validaValorDaConversao(TituloOmdb tituloOmdb) {
        if (tituloOmdb.title().isEmpty() || tituloOmdb.year().isEmpty() || tituloOmdb.runtime().isEmpty()) {
            throw new ErroDeValorVazioException("Não foi possível converter o Título porque ele tem valor(es) vázio(s)" +
                    ". Adicione valor(es) nele(s).");
        }

        if (tituloOmdb.year().matches(".*\\D.*")) {
            throw new ErroDeCaractereInvalidoException("Não foi possível converter o ano porque ele tem caracteres inválidos." +
                    " É preciso somente números.");
        }

        if (!tituloOmdb.runtime().matches(".*\\d.*\\d.*")) {
            throw new ErroDeCaractereInvalidoException("Não foi possível converter a duração porque ele tem caracteres inválidos." +
                    " É preciso pelo menos dois números.");
        }

        return true;
    }

    @Override
    public int getClassificacao() {
        if (visualizacoes >= 300000) {
            return 1;
        } else if (visualizacoes >= 200000) {
            return 2;
        } else if (visualizacoes >= 100000) {
            return 3;
        }
        return 0;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return nome.compareTo(outroTitulo.nome);
    }

    @Override
    public String toString() {
        return "Título: " + nome + "\nAno de lançamento: " + anoDeLancamento + "\nDuração: " + duracao + " minutos";
    }
}
