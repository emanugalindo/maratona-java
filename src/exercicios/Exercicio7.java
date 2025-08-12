package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são
        VERDADEIRO ou FALSO.
         */
        Scanner sc = new Scanner(System.in);
        boolean a, b;
        System.out.println("Digite o primeiro valor(true|false): ");
        a = sc.nextBoolean();
        System.out.println("Digite o segundo valor(true|false): ");
        b = sc.nextBoolean();
        System.out.println(a == b ? "VERDADEIRO" : "FALSO");
    }
}
