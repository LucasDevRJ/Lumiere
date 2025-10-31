public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento;
        boolean incluidoNoPlano;
        double notaDoFilme;
        String tipoDePlano;

        tipoDePlano = "Plano Plus";
        anoDeLancamento = 1999;
        incluidoNoPlano = true;
        if (anoDeLancamento >= 2010) {
            System.out.println("Lançamentos mais curtidos!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano && tipoDePlano.equals("Plano Plus")) {
            System.out.println("Título disponível!");
        } else {
            System.out.println("Título não disponível.");
        }
    }
}
