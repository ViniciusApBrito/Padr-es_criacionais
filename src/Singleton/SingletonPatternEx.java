package Singleton;

public class SingletonPatternEx

{

    public static void main(String[] args)

    {

        System.out.println("***Exemplo do Padrão Singleton***\n");

        System.out.println("Tentando criar um pool de recursos para a aplicação.");

        CriaPoolDeRecursos p1 = CriaPoolDeRecursos.getPoolDeRecursos();

        System.out.println("Tentando criar outro pool de recursos para a aplicação.");

        CriaPoolDeRecursos p2 = CriaPoolDeRecursos.getPoolDeRecursos();

        if (p1 == p2)

        {

            System.out.println("p1 e p2 são as mesmas instâncias.");

        }

    }

}