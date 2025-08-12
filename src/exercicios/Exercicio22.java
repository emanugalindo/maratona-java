package exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente
        e o resto da divisão inteira entre eles.
         */
        Scanner sc = new Scanner(System.in);
        int a, b, quociente = 0, resto = 0;
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        quociente = a / b;
        resto = a % b;
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
