# Sobrecarga

--- 

## O que é Sobrecarga?

 Sobrecarga (ou Overloading) em Java acontece quando você define múltiplos métodos com o mesmo nome, mas com diferentes parâmetros (quantidade, tipo ou ordem).

 > A sobrecarga permite reutilizar o nome do método para comportamentos semelhantes com entradas diferentes.

 ---

 ### Características da Sobrecarga

 - Mesmo nome de método

- Parâmetros diferentes

- Pode variar a quantidade, tipo ou ordem dos parâmetros

- Pode ser aplicada em construtores ou métodos comuns
 
- O retorno não influencia a sobrecarga

---

### Exemplo básico de método sobrecarregado

```java
    public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Utilização no `main`:

```java
    public class Program {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));           // 5
        System.out.println(calc.somar(2.5, 3.2));       // 5.7
        System.out.println(calc.somar(1, 2, 3));        // 6
    }
}
```

---

### Sobrecarga de Construtores

Sobrecarga também pode ser usada em construtores, como mostrado no exemplo da classe `Livro`:

```java
public class Livro {
    private String titulo;
    private String autor;

    public Livro() {
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
    }

    public Livro(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconhecido";
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
```

>Três construtores com o mesmo nome, mas com diferentes assinaturas.

---

### Por que usar Sobrecarga?

- Deixa o código mais limpo e organizado

- Facilita o uso de métodos para diferentes entradas

- Reduz repetição de nomes desnecessários

- Ajuda a adaptar funções sem quebrar o código existente

---

### O que não é sobrecarga?

```java
public int somar(int a, int b) { ... }
public double somar(int x, int y) { ... } // ❌ Não é sobrecarga válida só por mudar o tipo de retorno
```

>A assinatura de um método é composta apenas pelo nome e parâmetros. O tipo de retorno não é considerado.

---

# Conclusão

>A sobrecarga permite que você use o mesmo nome de método para realizar tarefas semelhantes com diferentes tipos ou quantidades de dados. Isso deixa o código mais organizado, fácil de ler e mais prático de usar, já que você não precisa criar vários métodos com nomes diferentes para funções parecidas.