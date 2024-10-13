package Singleton;

public class CriaPoolDeRecursos

{
    private static CriaPoolDeRecursos _pool;

    private CriaPoolDeRecursos() {
    }

    public static CriaPoolDeRecursos getPoolDeRecursos() {
        if (_pool == null)

        {
            _pool = new CriaPoolDeRecursos();
            System.out.println("Criado um pool de recursos para a aplicação.");
        } else {
            System.out.print("Um pool de recursos já foi criado para a aplicação.");
        }

        return _pool;

    }

}
