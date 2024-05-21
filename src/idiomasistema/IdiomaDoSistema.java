package idiomasistema;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        System.getProperties();
        System.out.println ("O idioma do seu sistema é:");
        System.out.println(System.getProperty("user.language"));
    }
}
