import com.lucasdevrj.lumiere.calculos.CalculadoraDeTempo;
import com.lucasdevrj.lumiere.calculos.FiltroRecomendacao;
import com.lucasdevrj.lumiere.modelos.Episodio;
import com.lucasdevrj.lumiere.modelos.Filme;
import com.lucasdevrj.lumiere.modelos.Serie;
import com.lucasdevrj.lumiere.stream.InteracaoComTitulo;
import com.lucasdevrj.lumiere.stream.VelocidadeDaReproducao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Sonic – O Filme");
        filme1.setAnoDeLancamento(2020);
        filme1.setDuracao(99);
        filme1.setGenero("Ação, Aventura e Comédia");
        filme1.setDiretor("Jeff Fowler");
        filme1.setElenco("Ben Schwartz, Jim Carrey, James Marsden e Tika Sumpter");
        filme1.setSinopse("Sonic, um ouriço azul com habilidades extraordinárias, foge para a Terra e tenta viver " +
                "escondido. Após ser descoberto por um policial, eles precisam se unir para impedir que o cientista " +
                "Dr. Robotnik capture Sonic e use seus poderes para dominar o mundo.");
        filme1.setIncluidoNoPlano(true);
        filme1.setClassificacaoIndicativa(10);
        filme1.setTemCenaPosCredito(true);
        filme1.setStudio("Paramount Pictures");
        filme1.setTrilhaSonora("Tom Holkenborg (Junkie XL)");

        filme1.avaliarTitulo(5);
        filme1.avaliarTitulo(6);
        filme1.avaliarTitulo(9);
        filme1.avaliarTitulo(2);
        filme1.exibirFichaTecnica();
        filme1.zerarAvaliacoes();
        filme1.avaliarTitulo(1);
        filme1.exibirFichaTecnica();

        InteracaoComTitulo interacao = new InteracaoComTitulo();
        interacao.assistir(filme1);

        VelocidadeDaReproducao velocidadeDaReproducao = new VelocidadeDaReproducao();
        velocidadeDaReproducao.aumentarVelocidadeDaReproducao(filme1);
        velocidadeDaReproducao.aumentarVelocidadeDaReproducao(filme1);
        velocidadeDaReproducao.aumentarVelocidadeDaReproducao(filme1);
        velocidadeDaReproducao.aumentarVelocidadeDaReproducao(filme1);
        velocidadeDaReproducao.aumentarVelocidadeDaReproducao(filme1);

        velocidadeDaReproducao.diminuirVelocidadeDaReproducao(filme1);
        velocidadeDaReproducao.diminuirVelocidadeDaReproducao(filme1);
        velocidadeDaReproducao.diminuirVelocidadeDaReproducao(filme1);

        interacao.pausar(filme1);
        interacao.encerrar(filme1);

        filme1.exibirTitulo();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.adicionaTitulo(filme1);
        calculadora.exibirQuantidadeDeTempoAssistido();

        filme1.avaliarTitulo(10);

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(filme1);

        Filme filme2 = new Filme();
        filme2.setNome("Batman Begins");
        filme2.setDuracao(140);
        filme2.setGenero("Noir, Ação e Aventura");
        filme2.setAnoDeLancamento(2005);
        filme2.setSinopse("Em meio a uma ameaça tóxica e uma liga de assassinos, Bruce Wayne se vê forçado a enfrentar muito mais do que seus próprios demônios.");
        filme2.setIncluidoNoPlano(true);
        filme2.setDiretor("Christopher Nolan");
        filme2.setElenco("Christian Bale, Michael Caine, Liam Neeson");
        filme2.setClassificacaoIndicativa(14);
        filme2.setTemCenaPosCredito(false);
        filme2.setVisualizacoes(200000);
        filme2.exibirFichaTecnica();

        calculadora.adicionaTitulo(filme2);
        calculadora.exibirQuantidadeDeTempoAssistido();

        Filme filme3 = new Filme();
        filme3.setNome("Matrix");
        filme3.setDuracao(136);
        filme3.setGenero("Ficção científica");
        filme3.setAnoDeLancamento(1999);
        filme3.setSinopse("O que é a Matrix? Em busca de respostas, o hacker Neo entra em um caminho sem volta e descobre a surpreendente verdade sobre o mundo em que vive.");
        filme3.setIncluidoNoPlano(true);
        filme3.avaliarTitulo(10);
        filme3.setDiretor("Lana Wachowski e Lilly Wachowski");
        filme3.setElenco("Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss...");
        filme3.setClassificacaoIndicativa(14);
        filme3.setTemCenaPosCredito(false);
        filme3.setStudio("Warner Bros");
        filme3.setTrilhaSonora("Clubbed to Death");
        filme3.exibirFichaTecnica();

        Serie serie1 = new Serie();
        serie1.setNome("The Mandalorian");
        serie1.setGenero("Ficção científica, Aventura e Ação");
        serie1.setAnoDeLancamento(2019);
        serie1.setCriador("Jon Favreau");
        serie1.setDiretor("Jon Favreau, Dave Filoni, Rick Famuyiwa, Bryce Dallas Howard");
        serie1.setQuantidadeDeTemporadas(3);
        serie1.setAindaEstaEmProducao(true);
        serie1.setQuantidadeDeEpisodios(24);
        serie1.setQuantidadeDeMinutosPorEpisodio(55);
        serie1.setElenco("Pedro Pascal");
        serie1.setSinopse("A série se passa no universo de “Star Wars”, após a queda do Império; " +
                "acompanha um caçador de recompensas solitário que aceita missões perigosas — " +
                "e ao longo da história acaba formando vínculos, enfrentando dilemas morais " +
                "e desafios numa galáxia cheia de perigos.");
        serie1.setClassificacaoIndicativa(12);
        serie1.avaliarTitulo(10);
        serie1.avaliarTitulo(7);
        serie1.avaliarTitulo(7);
        serie1.exibirTitulo();
        serie1.exibirFichaTecnica();
        serie1.getClassificacao();

        Episodio episodio1 = new Episodio();
        episodio1.setNome("Capítulo 1: O Mandaloriano");
        episodio1.setNumero(1);
        episodio1.setDuracao(39);
        episodio1.setSerie(serie1);
        episodio1.setVisualizacoes(12000);
        episodio1.exibirInformacoes();

        System.out.println();
        filtroRecomendacao.filtra(episodio1);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do primeiro filme = " + listaDeFilmes.get(0).toString());
    }
}
