package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor
        e o seu sucessor.
         */
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite o número: ");
        num = sc.nextInt();
        System.out.println("Antecessor: " + (num - 1) + "\nSucessor: " + (num + 1));
    }
}
