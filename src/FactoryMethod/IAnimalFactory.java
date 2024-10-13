package FactoryMethod;

public abstract class IAnimalFactory {

    public abstract IAnimal getTipoAnimal(String tipo) throws Exception;

}
