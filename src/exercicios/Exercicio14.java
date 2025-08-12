package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de
        B por A e imprima na tela os valores.
         */
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("A: " + a + "\nB: " + b);
    }
}
