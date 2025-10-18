package org.example.exercicio21;

public class Pedido {

    private Cliente cliente;
    private double valorTotal;

    public Pedido(Cliente cliente, double valorTotal) {
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void exibirInfo() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Valor do pedido: R$ " + valorTotal);
        System.out.println("-----------------------");
    }
}
