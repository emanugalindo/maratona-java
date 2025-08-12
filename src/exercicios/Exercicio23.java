package exercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As
        informações fornecidas serão: valor da hora de aula, número de aulas lecionadas no mês e
        percentual de desconto do INSS. Imprima na tela o salário líquido final.
         */
        Scanner sc = new Scanner(System.in);
        double valorHoraAula, descontoInss, salarioFinal;
        int numAulas;
        System.out.println("Digite o valor da hora de aula:");
        valorHoraAula = sc.nextDouble();
        System.out.println("Digite o número de aulas do mês:");
        numAulas = sc.nextInt();
        System.out.println("Digite o percentual de desconto do INSS:");
        descontoInss = sc.nextDouble();
        descontoInss = descontoInss / 100;
        salarioFinal = (valorHoraAula * numAulas) - ((valorHoraAula * numAulas) * (descontoInss));
        System.out.printf("Salário líquido: RS%.2f\n", salarioFinal);
    }
}
