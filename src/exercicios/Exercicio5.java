package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
        (Base para o Salário mínimo R$ 1.293,20).
         */
        Scanner sc = new Scanner(System.in);
        double salMinimo, salUsuario, vezesSalMin;
        System.out.println("Digite o valor do salário mínimo: ");
        salMinimo = sc.nextDouble();
        if (salMinimo >= 1293.20) salMinimo = salMinimo;
        else salMinimo = 1293.20;
        System.out.println("Digite o valor do seu salário: ");
        salUsuario = sc.nextDouble();
        vezesSalMin = salUsuario / salMinimo;
        System.out.println("Salário mínimo: " + salMinimo);
        System.out.println("Salário usuário: " + salUsuario);
        System.out.printf("Quantidade de salários mínimos ganhos: %.2f", vezesSalMin);
    }
}
