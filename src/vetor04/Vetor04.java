package vetor04;

import java.util.Arrays;


public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3, 5, 6, 9, 2, 4, 0, 1};
        Arrays.sort(vet);
        for (int valor:vet) {
            System.out.print(valor + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 9);
        System.out.println("Encontrei o valor na posição " +p);
    }
}
