package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("José");
        funcionario.setIdade(38);
        funcionario.setSalarios(new double[]{2500, 2000, 3000});

        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());
    }
}
