package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local1 = new Local("Av. A, 266");
        Local local2 = new Local("Rua B, 20");

        Professor professor1 = new Professor("Paulo", "Medicina");
        Professor professor2 = new Professor("Petra", "Direito");

        Aluno aluno1 = new Aluno("Pedro", 25);
        Aluno aluno2 = new Aluno("José", 25);
        Aluno aluno3 = new Aluno("Catarina", 30);
        Aluno aluno4 = new Aluno("Marcela", 20);
        Aluno aluno5 = new Aluno("Thiago", 35);
        Aluno aluno6 = new Aluno("Jorge", 48);

        Aluno[] alunosSeminario1 = {aluno1, aluno2, aluno3, aluno4, aluno5};
        Aluno[] alunosSeminario2 = {aluno6};

        Seminario seminario1 = new Seminario("Seminário sobre Vacinação", alunosSeminario1, local1);
        Seminario seminario2 = new Seminario("Lei Maria da Penha", alunosSeminario2, local2);

        professor1.setSeminarios(new Seminario[]{seminario1});
        professor2.setSeminarios(new Seminario[]{seminario2});


        professor1.imprime();
        professor2.imprime();

    }
}
