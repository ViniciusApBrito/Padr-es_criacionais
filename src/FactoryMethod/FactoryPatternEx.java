package FactoryMethod;

public class FactoryPatternEx {

    public static void main(String[] args) throws Exception {

        System.out.println("***Exemplo Padrão Factory:***\n");

        IAnimalFactory animalFactory = new ConcreteFactory();

        IAnimal gato = animalFactory.getTipoAnimal("Gato");
        gato.comunicar();

        IAnimal cachorro = animalFactory.getTipoAnimal("Cachorro");
        cachorro.comunicar();

        // Na tentativa de criar Pato será retornada uma exceção, pois não existe um animal do tipo Pato.
        try {
            IAnimal pato = animalFactory.getTipoAnimal("Pato");
            pato.comunicar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
