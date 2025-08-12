package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo para receber um número qualquer e imprimir na tela se o número
        é par ou ímpar, positivo ou negativo.
         */
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite o número: ");
        num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "O número é par" : "O número é ímpar");
       if(num > 0) System.out.println("O número é positivo");
       else if (num < 0) System.out.println("O número é negativo");
       else System.out.println("O número é igual a 0");
    }
}
