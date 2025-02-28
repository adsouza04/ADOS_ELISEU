import java.util.Scanner;

class imc{
    public static void main(String [] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Me informe seu peso: ");
        double peso = ler.nextDouble();

        System.out.println("Me informe sua altura");
        double altura = ler.nextDouble();

        double soma = peso / (altura * altura);


        if ( soma < 18.5) {
            System.out.println("Abaixo do peso ");
        }

        else if (soma > 18.5 && soma <= 24.9) {
            System.out.println("Peso normal");  
        }

        else {
            System.out.println ("Está com sobrepeso");
        }

    }

}