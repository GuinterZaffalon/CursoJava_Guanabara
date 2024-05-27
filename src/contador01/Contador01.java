
package contador01;


public class Contador01 {
    public static void main(String[] args) {
        
        int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 2) {
                break;
            }
            System.out.println("Camabalhota " +cc);
        }
    }
}
