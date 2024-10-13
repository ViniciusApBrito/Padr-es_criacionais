package Builder;

public class BuilderPatternEx {

    public static void main(String[] args) {

        System.out.println("***Exemplo do padrão Builder:***\n");

        Director director = new Director();

        IBuilder carroBuilder = new Carro();

        IBuilder motoBuilder = new Moto();

        // Construindo um Carro
        director.construir(carroBuilder);

        Produto p1 = carroBuilder.getVeiculo();

        p1.exibir();

        // Construindo uma Moto
        director.construir(motoBuilder);

        Produto p2 = motoBuilder.getVeiculo();

        p2.exibir();

    }

}
