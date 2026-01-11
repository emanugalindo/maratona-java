package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Emanuel";
        nome.concat(" Galindo");
        nome = nome.substring(0, 3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Emanuel");
        sb.append(" Galindo");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
