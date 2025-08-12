package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
        conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor
        final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento
        para efetuar o cálculo adequado.

        Tabela de Código de Condições de Pagamento

        1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

        2 - À Vista no cartão de crédito, recebe 10% de desconto

        3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

        4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
         */
        Scanner sc = new Scanner(System.in);
        double valorProduto, valorPagamento = 0;
        int opcao;
        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();
        System.out.println("Escolha:");
        System.out.println("1 - À Vista em Dinheiro ou Pix");
        System.out.println("2 - À Vista no cartão de crédito");
        System.out.println("3 - Parcelado no cartão em duas vezes");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais");
        System.out.println("Digite a opção escolhida: ");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                valorPagamento = valorProduto - (valorProduto * 0.15);
                break;
            case 2:
                valorPagamento = valorProduto - (valorProduto * 0.1);
                break;
            case 3:
                valorPagamento = valorProduto;
                break;
            case 4:
                valorPagamento = valorProduto * 1.1;
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.printf("Valor a ser pago: %.2f", valorPagamento);
    }
}
