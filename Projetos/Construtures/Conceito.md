#  Construtores em Java

---

##  O que é um Construtor?

Um **construtor** é um método especial de uma classe, usado para **criar e inicializar objetos**. Ele é chamado **automaticamente** no momento em que usamos a palavra-chave `new`.

>  Todo objeto em Java **é criado através de um construtor**, mesmo que você não declare um — o compilador cria um **construtor padrão** automaticamente.

---

##  Características dos Construtores

- **Mesmo nome da classe**
- **Não tem tipo de retorno**, nem `void`
- Podem ser **sobrecarregados** (vários com argumentos diferentes)
- Podem ter **parâmetros** para iniciar o objeto já com valores

---

##  Exemplo básico de construtor

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
```

### Utilização no main:

```java
public class Program {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 25);
        p1.apresentar();
    }
}
```

### Saída:

```java
Olá, meu nome é João e tenho 25 anos.
```

---

##  Construtor Padrão (sem parâmetros)

> Se você não criar nenhum construtor, o Java cria um construtor vazio por padrão:

```java
public class Animal {
    public Animal() {
        System.out.println("Um novo animal foi criado!");
    }
}
```

> Se você criar qualquer outro construtor com parâmetros, o construtor padrão desaparece (e precisa ser reescrito se necessário).

---

## Sobrecarga de Construtores

> Você pode criar vários construtores com diferentes assinaturas (quantidade ou tipo de parâmetros):

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

    public void exibirInfo() {
        System.out.println(titulo + " - " + autor);
    }
}
```

### Uso:

```java
Livro l1 = new Livro();
Livro l2 = new Livro("1984");
Livro l3 = new Livro("Dom Casmurro", "Machado de Assis");

l1.exibirInfo(); // Sem título - Desconhecido
l2.exibirInfo(); // 1984 - Desconhecido
l3.exibirInfo(); // Dom Casmurro - Machado de Assis
```

## Por que usar Construtores?

- Organiza a criação de objetos

- Força a inicialização correta dos dados

- Evita objetos incompletos

- Ajuda a manter a lógica de inicialização em um único lugar

## Conclusão

> Construtores são parte fundamental da POO em Java. Eles oferecem uma forma segura e prática de criar objetos já com os dados certos, e evitam que você tenha que configurar tudo manualmente depois da criação. Usar bem os construtores ajuda a manter seu código mais limpo, seguro e robusto.

