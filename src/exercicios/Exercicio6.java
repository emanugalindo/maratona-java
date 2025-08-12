package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
         */
        Scanner sc = new Scanner(System.in);
        double valor, reajuste = 0;
        System.out.println("Digite o valor: ");
        valor = sc.nextDouble();
        reajuste = valor * 1.05;
        System.out.println("Valor reajustado: " + reajuste);
    }
}
