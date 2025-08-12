package exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura
        correspondente em grau Celsius. Imprima na tela as duas temperaturas.

        Fórmula: C = (5 * ( F-32) / 9)
         */
        Scanner sc = new Scanner(System.in);
        int fahrenheit, celsius = 0;
        System.out.println("Digite a temperatura em ºF: ");
        fahrenheit = sc.nextInt();
        celsius = (5 * (fahrenheit - 32) / 9);
        System.out.println(fahrenheit + "°F é igual a " + celsius + "°C.");
    }
}
