package exercicios;

public class Exercicio19 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("===Tabuada do " + i + "===");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
