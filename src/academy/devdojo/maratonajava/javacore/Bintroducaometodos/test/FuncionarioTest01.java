package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "José";
        funcionario.idade = 38;
        funcionario.salarios = new double[]{2500, 2000, 3000};

        funcionario.imprime();
    }
}
