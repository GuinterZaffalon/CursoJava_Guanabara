
package comparacaostring;


public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Guinter";
        String nome2 = "Guinter";
        String nome3 = new String("Guinter");
        String resultado = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(resultado);
    }
}
