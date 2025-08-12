package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma
        entre A e B é mostre se a soma é menor que C.
         */
        Scanner sc = new Scanner(System.in);
        int a, b, c, soma;
        System.out.println("Digite o valor de a: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de c: ");
        c = sc.nextInt();
        soma = a + b;
        System.out.println("Soma: " + soma);
        System.out.println(soma < c ? "A soma é menor que o valor de C" : "A soma é maior ou igual ao valor de C");
    }
}
