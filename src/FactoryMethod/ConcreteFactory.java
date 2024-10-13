package FactoryMethod;

public class ConcreteFactory extends IAnimalFactory {

    @Override
    public IAnimal getTipoAnimal(String tipo) throws Exception {
        switch (tipo) {
            case "Gato" -> {
                return new Gato();
            }
            case "Cachorro" -> {
                return new Cachorro();
            }
            default -> throw new Exception("O Tipo Animal " + tipo + " não pode ser instanciado.");
        }
    }
}
