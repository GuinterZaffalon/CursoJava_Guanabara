package programamedia;
import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Primeia nota: ");
    float n1 = teclado.nextFloat();
    System.out.print("Segunda nota: ");
    float n2 = teclado.nextFloat();
    float m = (n1+n2)/2;
    System.out.println("A sua média foi: " + m);
    
    if (m>=9) {
        System.out.println("Parabéns!");
    }  
  }
}
