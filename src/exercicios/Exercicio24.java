package exercicios;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma
        viagem, sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo
        que será gasto na viagem a sua velocidade média, distância percorrida e a quantidade
        de litros utilizados para fazer a viagem.

        Fórmula: distância = tempo x velocidade.

        litros usados = distância / 12.
         */
        Scanner sc = new Scanner(System.in);
        int distancia = 0, tempo, velocidade, litrosUsados = 0;
        System.out.println("Digite o tempo da viagem em horas: ");
        tempo = sc.nextInt();
        System.out.println("Digite a velocidade média da viagem: ");
        velocidade = sc.nextInt();
        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;

        System.out.println("Tempo da viagem: " + tempo + "hr(s)");
        System.out.println("Velocidade média: " + velocidade + "km/h");
        System.out.println("Distância percorrida: " + distancia + "km");
        System.out.println("Litros usados: " + litrosUsados + "L");
    }
}
