
import java.util.Scanner;

class Exemplo1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double a, b, c;
        String tipo;

        System.out.println("Digite o lado A:");
        a = leitor.nextDouble();

        System.out.println("Digite o lado B:");
        b = leitor.nextDouble();

        System.out.println("Digite o lado C:");
        c = leitor.nextDouble();

        if ((a == b && a != c) || (a == c && a != b) || (b == c && c != a)) {
            tipo = "O tipo de triângulo é um Isósceles!";
        } else {
            tipo = "O triângulo não é isósceles!";
        }

        String saida;
        saida = String.format("%s", tipo);
        System.out.println(saida);
    }
}
