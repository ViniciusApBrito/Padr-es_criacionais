# Estudo de Padrões Criacionais

## Introdução

Este documento é uma compilação de estudos sobre os principais padrões criacionais de design, suas implementações e como eles podem ser aplicados em projetos de software.

## Macete para Lembrar os Padrões Criacionais

"Uma fábrica abstrata (Abstract Factory) constrói (Builder) protótipos (Prototype) utilizando de métodos de fabricação (Factory Method) únicos (Singleton)."

## Padrão Singleton

### Objetivo
Garantir que uma classe tenha apenas uma única instância durante toda a execução de um programa e fornecer um ponto de acesso global a essa instância.

### Exemplo
```java
public class CriaPoolDeRecursos {
    private static CriaPoolDeRecursos _pool;

    private CriaPoolDeRecursos() { }

    public static synchronized CriaPoolDeRecursos getPoolDeRecursos() {
        if (_pool == null) {
            _pool = new CriaPoolDeRecursos();
            System.out.println("Criado um pool de recursos para a aplicação.");
        } else {
            System.out.print("Um pool de recursos já foi criado para a aplicação.");
        }
        return _pool;
    }
}
```
Problema e Solução
O padrão Singleton não é seguro em ambientes multithread. Para resolver isso, usamos o modificador synchronized no método getPoolDeRecursos() para garantir que apenas uma thread possa acessar o método por vez.

Padrão Abstract Factory
Objetivo
Fornecer uma interface para criar famílias de objetos relacionados ou dependentes, sem especificar suas classes concretas.

### Exemplo
```java
interface MobiliarioFactory {
    Cadeira criarCadeira();
    Mesa criarMesa();
}
```
As classes concretas implementam essa interface para criar famílias específicas de produtos.

## Padrão Prototype
### Objetivo
Permite a criação de novos objetos através da clonagem de objetos existentes, em vez de instanciá-los diretamente.

### Exemplo
```java
public class ConcretePrototype implements Prototype {
    private String name;
    private int value;

    public ConcretePrototype(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name, this.value);
    }
}

```
## Padrão Factory Method
### Objetivo
Fornecer uma interface para criar objetos em uma classe, permitindo que as subclasses decidam quais objetos instanciar.

### Exemplo
```java
public class VeiculoFactory {
    public IVeiculo getVeiculo(String tipo) throws Exception {
        switch (tipo) {
            case "Carro":
                return new Carro();
            case "Bicicleta":
                return new Bicicleta();
            default:
                throw new Exception("Tipo de veículo não reconhecido!");
        }
    }
}

```

## Padrão Builder
### Objetivo
Separar a construção de um objeto complexo da sua representação, permitindo que o mesmo processo de construção crie diferentes representações.

## Implementação
Usa uma classe chamada "Builder", que contém métodos específicos para configurar partes do objeto complexo. O objeto final é criado por meio de um processo passo a passo.

## Considerações Finais
A compreensão e aplicação desses padrões de design são cruciais para a criação de software bem estruturado e de fácil manutenção. Estudar esses padrões ajuda a desenvolver habilidades de programação mais avançadas e a escrever código mais limpo e eficiente.
