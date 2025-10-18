#  Documentação Java — Métodos, Chamadas e Objetos

---

##  O que é uma Classe em Java?

Uma **classe** é o **modelo (ou molde)** para criar objetos. Ela define:
- **Quais dados** o objeto vai ter (🔹 atributos)
- **Quais ações** ele pode executar (🔹 métodos)

> 🎓 Exemplo real: se você fosse criar um sistema para gerenciar alunos, você poderia ter uma classe chamada `Aluno`, que define o que todo aluno deve ter (nome, idade, matrícula) e o que ele pode fazer (se apresentar, consultar nota, etc.)

---

###  Estrutura Básica de uma Classe

```java
public class NomeDaClasse {
    // atributos (características)
    // métodos (comportamentos)
}
```

#### Exemplo: Classe Carro

```java
public class Carro {
    String modelo;
    int ano;
    double velocidade;

    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    public void frear() {
        velocidade = 0;
        System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
    }
}
```

### Por que usar classes?





---

###  O que são Métodos em Java?

Métodos são **blocos de código** que realizam tarefas específicas. Eles ajudam a **organizar o código**, **reutilizar lógicas** e **modularizar** funcionalidades.

---

## O que é um Objeto?

Objeto é uma instância de uma classe. Ele representa um "ser" com características (atributos) e comportamentos (métodos).

> A classe é o molde, o objeto é o produto pronto.

### Criando uma Classe

```java
public class Pessoa {
    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
    }
}
```

#### Criando um Objeto

```java
Pessoa p1 = new Pessoa();
```

- Pessoa → Tipo da classe

- p1 → Nome da variável (referência)

- new Pessoa() → Instancia (cria) um novo objeto

#### Manipulando o Objeto

```java
p1.nome = "João";
p1.idade = 25;
p1.apresentar();
```

#### Criando vários objetos

```java
Pessoa p2 = new Pessoa();
p2.nome = "Maria";
p2.idade = 30;
p2.apresentar();
```

#### Construtores

> Construtores são usados para inicializar objetos com valores logo na criação.

```java 
public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
    }
}
```

```java
Pessoa p3 = new Pessoa("Pedro", 19);
p3.apresentar();

```

---

###  Estrutura de um Método

```java
modificador tipoRetorno nomeDoMetodo(tipo parametro) {
    // corpo do método
}
```

- Organização: separa os elementos do sistema em blocos lógicos

- Reutilização: você pode criar vários objetos da mesma classe

- Modularização: cada classe pode cuidar de uma parte do sistema

- Facilita manutenção: tudo que diz respeito a "Carro", por exemplo, está centralizado

### Componentes:

- modificador → Define o nível de acesso (public, private, etc.)

- tipoRetorno → Tipo do dado que o método retorna (int, void, String, etc.)

- nomeDoMetodo → Nome do método (usa camelCase)

- tipo parametro → Argumentos que o método recebe (opcional)

### Exemplo Simples

```java
public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public void exibirMensagem() {
        System.out.println("Bem-vindo!");
    }
}
```

### Como Usar Métodos

> Você pode chamar um método de várias formas:

#### 1. Atribuir o retorno a uma variável

```java
int resultado = calc.somar(5, 3);
```

#### 2. Chamar direto, sem guardar o retorno

```java
System.out.println(calc.somar(10, 2));
```

#### 3. Chamar método void (sem retorno)

```java
calc.exibirMensagem();
```

#### 4. Chamada de método static

```java
public class Util {
    public static int quadrado(int x) {
        return x * x;
    }
}

int q = Util.quadrado(4);
```

#### 5. Chamada dentro da mesma classe

```java 
public void iniciar() {
    exibirMensagem(); // chamada direta
}
```

#### 6. Encadeamento de métodos

```java
String texto = "joão".toUpperCase().trim();
```

---

### Tabela de Formas de Chamada

| Forma de Chamada       | Exemplo                         | Observação                        |
| ---------------------- | ------------------------------- | --------------------------------- |
| Atribuindo retorno     | `int x = obj.metodo();`         | Método precisa retornar algo      |
| Chamada direta         | `obj.metodo();`                 | Método pode ser `void`            |
| Método estático        | `Classe.metodo();`              | Sem necessidade de objeto         |
| Dentro da mesma classe | `metodo();`                     | Quando está no mesmo escopo       |
| Encadeando métodos     | `"texto".trim().toUpperCase();` | Quando o retorno é objeto/mutável |

---

##  O que são Argumentos em Java?

Em Java, **argumentos** são os **valores que você passa para um método** quando o chama.

> 💬 Exemplo prático: se você quer que um método calcule a soma de dois números, esses dois números são os argumentos.

---

##  Diferença entre Parâmetros e Argumentos

- **Parâmetro** → é o que você **declara** no método (como uma variável temporária)
- **Argumento** → é o que você **passa** quando chama o método

```java
public void saudacao(String nome) {  // "nome" é o parâmetro
    System.out.println("Olá, " + nome);
}

saudacao("João"); // "João" é o argumento
```

### Exemplo Completo com Argumentos

```java
public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }
}
```

#### Chamada:

```java
Calculadora calc = new Calculadora();
int resultado = calc.somar(10, 5); // 10 e 5 são os argumentos
```

##### Regras sobre Argumentos
- A quantidade e o tipo de argumentos precisam bater com os parâmetros do método.

- Os argumentos podem ser:

    - valores literais: somar(2, 3)

    - variáveis: somar(x, y)

    - expressões: somar(5 + 2, 3 * 4)

#### Por que usar argumentos?

- Torna os métodos mais genéricos e reutilizáveis

- Permite que o mesmo método funcione para vários valores diferentes

- Deixa o código mais limpo e modular

#### Exemplo com múltiplos tipos 

```java
public void exibirDados(String nome, int idade, boolean ativo) {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Ativo: " + ativo);
}

exibirDados("Lucas", 21, true);
```

#### Dica: Ordem e Tipos Importam

```java
public void exemplo(String texto, int numero) { }

// ERRADO
exemplo(5, "oi"); // erro: tipos e ordem trocados

// CERTO
exemplo("oi", 5);
```

---

| Termo     | O que é                                       | Exemplo                           |
| --------- | --------------------------------------------- | --------------------------------- |
| Parâmetro | Variável definida na **declaração** do método | `public void metodo(String nome)` |
| Argumento | Valor passado na **chamada** do método        | `metodo("João")`                  |

---

## ✅ Conclusão

Este material abordou os **fundamentos essenciais da programação orientada a objetos em Java**, com foco nos seguintes tópicos principais:

---

### 🧩 **Classes**
- Representam **modelos de objetos**, contendo atributos (dados) e métodos (ações).
- São a base da estrutura orientada a objetos, permitindo organizar e modularizar o código.

---

### 🧠 **Objetos**
- São **instâncias reais** das classes.
- Permitem manipular dados e executar comportamentos definidos na classe.
- Criados usando a palavra-chave `new`.

---

### 🔧 **Métodos**
- São **blocos de código reutilizáveis** que definem ações que os objetos podem executar.
- Podem retornar valores ou apenas realizar ações (`void`).
- Organizam a lógica do programa, melhoram a legibilidade e evitam repetição de código.

---

### 🧾 **Argumentos**
- São os **valores passados aos métodos** na hora da chamada.
- Permitem que os métodos sejam **dinâmicos e reutilizáveis**, recebendo dados externos para processar.
- São diferentes dos parâmetros, que são as variáveis definidas no cabeçalho do método.

---

### 🛠️ **Formas de chamar métodos**
- Com ou sem retorno
- Através de objetos (`obj.metodo()`)
- Diretamente pela classe se o método for `static`
- Atribuindo a uma variável, usando direto no `System.out.println()` ou em chamadas encadeadas

---


