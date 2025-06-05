package br.com.atividade3.produtos;

public class Livro extends Produto {
    private String autor;
    private int numPaginas;
    private boolean capaDura;

    public Livro(String nome, double preco, String autor, int numPaginas, boolean capaDura) {
        super(nome, preco);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.capaDura = capaDura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Capa dura: " + (capaDura ? "Sim" : "Não"));
    }
}
