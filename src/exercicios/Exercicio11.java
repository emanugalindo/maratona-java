package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das notas
        obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para
        o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
         */
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media = 0;
        System.out.println("Digite a primeira nota");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota");
        nota4 = sc.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Média: %.1f\n", media);
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
    }
}
