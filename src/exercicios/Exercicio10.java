package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média
        das notas.
         */
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media = 0;
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Média: %.1f", media);
    }
}
