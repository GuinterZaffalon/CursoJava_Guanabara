package resolucaosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        System.out.println("A resolução da tela é: " + screenWidth + " x " + screenHeight);
    }
}
