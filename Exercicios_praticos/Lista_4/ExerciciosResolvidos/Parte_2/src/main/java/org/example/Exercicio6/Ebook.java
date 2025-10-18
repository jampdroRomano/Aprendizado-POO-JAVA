package org.example.Exercicio6;

class Ebook extends Livro {
    private double tamanhoDoArquivo;

    public Ebook(String titulo, String autor, int anoPublicacao, double tamanhoDoArquivo) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tamanho do arquivo: " + tamanhoDoArquivo + "MB");
    }
}
