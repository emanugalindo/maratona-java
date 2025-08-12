package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B
        forem iguais, deverá somar os dois valores,
         */
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        c = a == b ? a + b : a * b;
        System.out.println("Resultado: " + c);
    }
}
