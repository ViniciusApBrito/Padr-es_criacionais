package Builder;

public class Director {

    IBuilder meuBuilder;
    
    // Método com a série de passos para construção do veículo
    
    public void construir(IBuilder builder)
    
    {
    
    meuBuilder=builder;
    
    meuBuilder.constroiCarcaca();
    
    meuBuilder.inserePneus();
    
    meuBuilder.adicionaFarois();
    
    }
    
    }