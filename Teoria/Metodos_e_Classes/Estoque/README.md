# 📘 Documentação: Projeto de Gerenciamento de Produtos em Java

---



### Estrutura do Projeto

```cpp
├── application
│   └── Program.java         // classe principal
├── entities
│   ├── Product.java         // classe que representa um produto
│   └── ProductManager.java  // gerenciador de produtos
└── ui
    └── menuDeOperacoes.java // interface com o usuário
```

---

### Explicação dos Arquivos

---

#### Program.java

```java
package aplication;

import ui.menuDeOperacoes;

public class Program {
    public static void main(String[] args) {
        menuDeOperacoes menu = new menuDeOperacoes();
        menu.menuOpcoes(); // inicia o menu
    }
}
```

- `main(String[] args)`: ponto de partida do programa.

- Cria uma instância de `menuDeOperacoes` e chama o método `menuOpcoes()`.

---

#### Product.java

```java
public class Product {
    private static int ultimoId = 0;
    public int id;
    public String name;
    public double price;
    public int quantity;

```

- ultimoId: gera automaticamente IDs únicos para os produtos.

- Atributos (name, price, quantity) representam dados do produto.

```java
public Product() {
    ultimoId++;
    this.id = ultimoId;
}
```

- Método especial executado ao criar um novo objeto da classe Product.

- Garante que cada produto tenha um ID único.

> **Métodos da Classe**

```java
public double totalValueInStock() {
    return price * quantity;
}
```

- Calcula o valor total em estoque do produto.

```java
public void addProducts(int quantidade) {
    this.quantity += quantidade;
}
```

- Aumenta a quantidade no estoque.

```java
public void removeProducts(int quantidade) {
    this.quantity -= quantidade;
}
```

- Diminui a quantidade no estoque.

```java
public String toString() {
    return "ID: " + id + " | " + name + ", $ " + price ...
}
```

- Retorna uma representação em texto do objeto.

---

#### ProductManager.java

```java
private ArrayList<Product> listaProdutos = new ArrayList<>();
```

- Lista que armazena os produtos cadastrados.

> Métodos:

```java
public void adicionarProduto(Product produto) {
    listaProdutos.add(produto);
}
```

- Adiciona um novo produto à lista.

```java
public void listarProdutos() {
    // Lista todos os produtos
}
```

```java
public Product buscarProdutoPorId(int id) {
    // Retorna o produto com ID correspondente ou null
}
```

---

#### menuDeOperacoes.java

> Esse é o menu interativo que exibe as opções e manipula os dados.

##### Exemplo de método:

```java
public void menuOpcoes() {
    Scanner sc = new Scanner(System.in);
    ...
}
```

- Usa um loop do-while para exibir o menu até o usuário digitar 0.

- Controla as ações com um switch baseado na entrada do usuário.

