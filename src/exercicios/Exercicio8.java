package exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os
        valores em ordem decrescente.
         */
        Scanner sc = new Scanner(System.in);
        int a, b, c, menor = 0, meio = 0, maior = 0;
        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        c = sc.nextInt();
        menor = Math.min(Math.min(a, b), c);
        maior = Math.max(Math.max(a, b), c);
        meio = a + b + c - menor - maior;
        System.out.println(menor + " " + meio + " " + maior);
    }
}
