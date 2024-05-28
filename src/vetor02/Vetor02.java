package vetor02;
import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abril", "Mai", "Jun", "Jul", "Ago",
            "Set", "Out", "Nov", "Dez"};
        int totalDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos dias tem o ano atual? [365 / 366] ");
        int ano = teclado.nextInt();
        if (ano == 366) {
            totalDias[1] = 29;
        } else {
            totalDias[1] = 28;
        }
        for (int c=0; c<mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " + totalDias[c] + " dias ao todo");
        }
    }
}
