package exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
         */
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor inteiro: ");
        valor = sc.nextInt();
        System.out.println("===Tabuada do " + valor + "===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + valor * i);
        }
    }
}
