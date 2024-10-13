package AbstractFactory;

public class AbstractFactoryPatternEx {

    public static void main(String[] args) {

        System.out.println("***Exemplo do padrão Abstract Factory***");

        FilmesAcaoFactory filmeAcao = new FilmesAcaoFactory();

        IFilmeBrasileiro filmeAcaoBR = filmeAcao.getFilmeBrasileiro();

        IFilmeAmericano filmeAcaoUS = filmeAcao.getFilmeAmericano();

        System.out.println(
        "\nOs filmes de Ação catalogados são:");

            System.out.println(filmeAcaoBR.nomeFilme());

        System.out.println(filmeAcaoUS.nomeFilme());

        FilmesComediaFactory filmeComedia = new FilmesComediaFactory();

        IFilmeBrasileiro filmeComediaBR = filmeComedia.getFilmeBrasileiro();

        IFilmeAmericano filmeComediaUS = filmeComedia.getFilmeAmericano();

        System.out.println("\nOs filmes de Comédia catalogados são::");

        System.out.println(filmeComediaBR.nomeFilme());

        System.out.println(filmeComediaUS.nomeFilme());

    }

}
