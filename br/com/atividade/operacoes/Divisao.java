package br.com.atividade.operacoes;

public class Divisao extends OperacaoMatematica {
    @Override
    public double calcular(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }
    }
}
