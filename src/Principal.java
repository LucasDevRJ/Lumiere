import com.lucasdevrj.lumiere.modelos.Filme;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Sonic – O Filme");
        filme1.setAnoDeLancamento(2020);
        filme1.setDuracaoEmMinutos(99);
        filme1.setGenero("Ação, Aventura e Comédia");
        filme1.setDiretor("Jeff Fowler");
        filme1.setElenco("Ben Schwartz, Jim Carrey, James Marsden e Tika Sumpter");
        filme1.setSinopse("Sonic, um ouriço azul com habilidades extraordinárias, foge para a Terra e tenta viver " +
                "escondido. Após ser descoberto por um policial, eles precisam se unir para impedir que o cientista " +
                "Dr. Robotnik capture Sonic e use seus poderes para dominar o mundo.");
        filme1.setIncluidoNoPlano(true);
        filme1.setClassificacaoIndicativa("10 anos");
        filme1.setTemCenaPosCredito(true);
        filme1.setStudio("Paramount Pictures");
        filme1.setTrilhaSonora("Tom Holkenborg (Junkie XL)");

        filme1.avaliarTitulo(5);
        filme1.avaliarTitulo(6);
        filme1.avaliarTitulo(9);
        filme1.avaliarTitulo(2);

        filme1.exibirFichaTecnica();
    }
}
