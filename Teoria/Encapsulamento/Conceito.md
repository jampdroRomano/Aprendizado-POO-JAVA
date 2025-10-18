# Encapsulamento em Java

---

## O que é Encapsulamento?

Encapsulamento é um dos pilares da programação orientada a objetos. Ele consiste em proteger os dados de uma classe, controlando o acesso a eles por meio de métodos públicos.

> A ideia é esconder os detalhes internos de como os dados funcionam e permitir que o acesso seja feito de forma controlada.

---

## Para que serve o Encapsulamento?

- Proteger os dados sensíveis

- Impedir acesso direto às variáveis

- Permitir validações antes de modificar dados

- Separar como os dados são usados de como eles são armazenados

---

## Como aplicar Encapsulamento?

- Tornar os atributos private

- Criar métodos públicos chamados getters e setters para acessar/modificar os dados

---

## Exemplo sem encapsulamento (errado)

```java
    public class ContaBancaria {
        public String titular;
        public double saldo;
    }
```

>Aqui qualquer parte do programa pode alterar o saldo livremente, inclusive de forma errada ou perigosa.

---

## Exemplo com encapsulamento (correto)

```java
public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
}
```

---

## Utilização:

```java
public class Program {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João");

        conta.depositar(1000);
        conta.sacar(300);

        System.out.println("Saldo: R$ " + conta.getSaldo());
    }
}
```
---

## Saída:

```
Saldo: R$ 700.0
```

---

## Benefícios do Encapsulamento

- Garante segurança dos dados

- Permite validações ao alterar valores

- Ajuda a organizar melhor o código

- Facilita manutenção e mudanças futuras

---

# Conclusão

> Encapsular é como trancar as variáveis em uma "caixa forte" e permitir o acesso apenas por meio de "chaves" (métodos). Isso deixa seu código mais seguro, limpo e fácil de controlar, evitando bugs causados por acessos indevidos aos dados.