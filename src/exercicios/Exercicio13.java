package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
        Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome de uma
        pessoa e se ela é maior ou menor de idade.
         */
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
        System.out.println("Nome: " + nome);
        System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade");
    }
}
