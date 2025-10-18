package entities;

public class Product {

    private static int ultimoId = 0;

    public int id;
    public String name;
    public double price;
    public int quantity;

    public Product() {
        ultimoId++;
        this.id = ultimoId;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantidade) {
        this.quantity += quantidade;
    }

    public void removeProducts(int quantidade) {
        this.quantity -= quantidade;
    }

    public String toString() {
        return "ID: " + id + " | " + name + ", $ " + String.format("%.2f", price)
                + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
