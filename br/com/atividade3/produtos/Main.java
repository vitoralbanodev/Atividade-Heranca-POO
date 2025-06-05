package br.com.atividade3.produtos;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", 39.90, "Machado de Assis", 256, true);
        Camisa camisa1 = new Camisa("Camisa Polo", 79.90, "Azul", "M", "Algodão");

        System.out.println("Informações do Livro:");
        livro1.exibirInfo();

        System.out.println("\nInformações da Camisa:");
        camisa1.exibirInfo();
    }
}
