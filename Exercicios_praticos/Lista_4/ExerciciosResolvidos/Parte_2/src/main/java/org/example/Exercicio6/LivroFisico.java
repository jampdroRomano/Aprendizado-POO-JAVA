package org.example.Exercicio6;

class LivroFisico extends Livro {
    private int numeroDePaginas;

    public LivroFisico(String titulo, String autor, int anoPublicacao, int numeroDePaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de páginas: " + numeroDePaginas);
    }
}
