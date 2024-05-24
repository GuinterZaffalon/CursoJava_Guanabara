package quantaspernasswitch;

import java.util.Scanner;


public class QuantasPernasSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas possui?");
        int pernas = teclado.nextInt();
        String tipo;
        
        switch (pernas) {
            case 1:
                tipo = "Saci!";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
}
