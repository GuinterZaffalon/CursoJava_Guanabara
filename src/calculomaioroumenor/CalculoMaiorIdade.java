
package calculomaioroumenor;
import java.util.Scanner;

public class CalculoMaiorIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu ano de nascimento: ");
        int idade = teclado.nextInt();
        int calculoMaior = (2024 - idade);
        
        if (calculoMaior >= 18) {
            System.out.println("Maior de idade!");
        }
        else {
            System.out.println("Menor de idade!");
        }
    }
}
