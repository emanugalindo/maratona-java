package exercicios;

public class Exercicio18 {
    public static void main(String[] args) {
        /*
        Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce
        3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos
        anos serão necessários para que Sara seja maior que Francisco.
         */
        double alturaFrancisco = 1.50, alturaSara = 1.10;
        int anos = 0;
        do {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos++;
        }while (alturaSara < alturaFrancisco);
        System.out.println("Sara passará a altura de Francisco em " + anos + " anos.");
        System.out.printf("Altura de Francisco: %.2f\n", alturaFrancisco);
        System.out.printf("Altura de Sara: %.2f\n", alturaSara);
    }
}
