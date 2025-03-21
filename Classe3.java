import javax.swing.JOptionPane;

public class Classe3 {
        public static void main(String args[]) {
           
        String status = null;

        JOptionPane.showMessageDialog(null, "*** Tabela de preços por idade ***");
       
        String nome = JOptionPane.showInputDialog(null, "Nome: ");
       
        double idade = Double.parseDouble(JOptionPane.showInputDialog(null, "Idade:"));
       
        if ( idade <= 10 ) {
            status = "R$ 30,00!";
        }
       
        else if (idade > 10 && idade <= 29) {
            status = "R$ 60,00";
        }
       
        else if (idade > 29 && idade <= 45) {
            status = "R$ 120,00";
        }

        else if (idade > 45 && idade <= 59 ) {
            status = "R$ 150,00";
        }
       
        else if (idade > 59 && idade <= 65 ) {
            status = "R$ 250,00";
        }

        else {
            status = "R$ 400,00";
        }
       
        JOptionPane.showMessageDialog(null, "O valor que " + nome + " deve pagar é " + status);
        System.exit(0);
           
        }
}