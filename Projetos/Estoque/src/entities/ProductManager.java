package entities;

import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Product produto) {
        listaProdutos.add(produto);
    }

    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Product p : listaProdutos) {
                System.out.println(p.toString());
            }
        }
    }

    public Product buscarProdutoPorId(int id) {
        for (Product p : listaProdutos) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }
}
