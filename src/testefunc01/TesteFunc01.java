package testefunc01;
import java.util.Scanner;


public class TesteFunc01 {
    
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int a = teclado.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = teclado.nextInt();
        int sm = soma(a,b);
        System.out.println("A soma vale: " +sm);
    }
}
