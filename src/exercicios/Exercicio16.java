package exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia três valores que representam os três lados de um triângulo
        e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou
        escaleno.
         */
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("Digite o valor do primeiro lado: ");
        lado1 = sc.nextInt();
        System.out.println("Digite o valor do segundo lado: ");
        lado2 = sc.nextInt();
        System.out.println("Digite o valor do terceiro lado: ");
        lado3 = sc.nextInt();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            if (lado1 == lado2 && lado2 == lado3) System.out.println("Triângulo Equilátero");
            else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) System.out.println("Triângulo Isósceles");
            else System.out.println("Triângulo Escaleno");
        }else{
            System.out.println("Os valores fornecidos não formam um triângulo");
        }
    }
}
