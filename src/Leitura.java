import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.print("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.print("Digite a sua nota (0-10): ");
        int nota = leitura.nextInt();

        String informacaoSobreFilme = """
                
                Nome do filme: %s
                Ano de lançamento: %d
                Nota dada: %d de 10
                """.formatted(filme, anoDeLancamento, nota);

        System.out.println(informacaoSobreFilme);
    }
}
