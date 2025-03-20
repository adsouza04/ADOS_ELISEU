import javax.swing.JOptionPane;

public class Classe1 {
    
 // Comparação de duas strings
    
public static void main (String args[]) {
    
 String a = JOptionPane.showInputDialog(null, "Digite uma palavra:");
 String b = JOptionPane.showInputDialog(null, "Digite outra palavra:");
 
 // compara se o conteúdo de a é o mesmo de b
if ( a.equals ( b ) ) {
 String msg = "As duas palavras digitadas são iguais:" + a ;
 JOptionPane.showMessageDialog(null, msg );
 }
 else {
 String msg = "As duas palavras digitadas são diferentes: " + a + " e " + b;
 JOptionPane.showMessageDialog(null, msg ); }
 System.exit(0);// finaliza programa
 
 }
}