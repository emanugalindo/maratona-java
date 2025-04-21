package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioaAnual = 70000;
        double valorImposto;
        if(salarioaAnual >= 0 && salarioaAnual <= 34712){
            valorImposto = salarioaAnual * 0.097;
        }else if(salarioaAnual >= 34713 && salarioaAnual <= 68507){
            valorImposto = salarioaAnual * 0.3735;
        }else{
            valorImposto = salarioaAnual * 0.4950;
        }
        System.out.println("O valor é de R$"+ valorImposto);
    }
}
