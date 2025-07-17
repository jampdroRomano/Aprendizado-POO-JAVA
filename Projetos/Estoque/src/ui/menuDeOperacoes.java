package ui;

import entities.Product;
import entities.ProductManager;
import java.util.Scanner;

public class menuDeOperacoes {

    private ProductManager gerenciador = new ProductManager();  // usa ProductManager

    public void menuOpcoes() {
        Scanner sc = new Scanner(System.in);
        int opcaoMenu;

        do {
            System.out.println("\n===== MENU ESTOQUE =====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Todos Produtos");
            System.out.println("3 - Buscar Produto por ID");
            System.out.println("4 - Adicionar Estoque");
            System.out.println("5 - Remover Estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {

                case 1:
                    Product novoProduto = new Product();

                    System.out.print("Nome: ");
                    novoProduto.name = sc.next();

                    System.out.print("Preço: ");
                    novoProduto.price = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    novoProduto.quantity = sc.nextInt();

                    gerenciador.adicionarProduto(novoProduto);   // ADICIONA NA LISTA via ProductManager

                    System.out.println("Produto cadastrado com ID: " + novoProduto.id);
                    break;

                case 2:
                    gerenciador.listarProdutos();  // LISTA via ProductManager
                    break;

                case 3:
                    System.out.print("Digite o ID: ");
                    int idBusca = sc.nextInt();
                    Product encontrado = gerenciador.buscarProdutoPorId(idBusca);

                    if (encontrado != null) {
                        System.out.println(encontrado.toString());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID do produto: ");
                    int idAdd = sc.nextInt();
                    Product produtoAdd = gerenciador.buscarProdutoPorId(idAdd);

                    if (produtoAdd != null) {
                        System.out.print("Quantidade a adicionar: ");
                        int qtdAdd = sc.nextInt();
                        produtoAdd.addProducts(qtdAdd);
                        System.out.println("Produto atualizado: " + produtoAdd.toString());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("ID do produto: ");
                    int idRemover = sc.nextInt();
                    Product produtoRemover = gerenciador.buscarProdutoPorId(idRemover);

                    if (produtoRemover != null) {
                        System.out.print("Quantidade a remover: ");
                        int qtdRemover = sc.nextInt();
                        produtoRemover.removeProducts(qtdRemover);
                        System.out.println("Produto atualizado: " + produtoRemover.toString());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcaoMenu != 0);

        sc.close();
    }
}
