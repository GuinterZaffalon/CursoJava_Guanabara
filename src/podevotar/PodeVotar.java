
package podevotar;
import java.util.Scanner;


public class PodeVotar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu ano de nascimento: ");
        int nascimentoAno = teclado.nextInt();
        
        int calculoIdade = 2024 - nascimentoAno;
        System.out.println("Sua idade é: " +calculoIdade);
        
        if (calculoIdade < 16) {
            System.out.println("Não pode votar!");
        } else if ((calculoIdade >= 16 && calculoIdade < 18) || (calculoIdade > 70)){
            
        } else {
            System.out.println("Voto obrigatório!");
        }
    
    }   
}