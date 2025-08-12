package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
        meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com
        30 dias.

        (Ex: 5 anos, 2 meses e 15 dias de vida)
         */
        Scanner sc = new Scanner(System.in);
        int anoNascimento, anosVividos = 0, mesesVividos = 0, diasVividos = 0;
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int mesAtual = hoje.getMonthValue();
        int diaAtual = hoje.getDayOfMonth();
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();

        anosVividos = anoAtual - anoNascimento;
        mesesVividos = (anosVividos * 12) + (mesAtual - 1);
        diasVividos = (anosVividos * 365) + ((mesAtual - 1) * 30) + diaAtual;

        System.out.printf("%d anos, %d meses, %d dias de vida\n", anosVividos, mesesVividos, diasVividos);
    }
}
