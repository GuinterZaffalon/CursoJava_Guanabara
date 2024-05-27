/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author guinterzaffalon
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, p, a = 0;
        
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: (valor 0 interrompe)"));
        if (n >100){
            a++;
        }
        s = s+n;
        p = n /2;
        
        } while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final:<hr> Soma final: " + s);        
        
    }
    
}
