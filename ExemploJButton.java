import javax.swing.JButton; // <- Importação que estava faltando
import javax.swing.JFrame;

public class ExemploJButton { // Corrigido para "Exemplo"

    public static void main(String[] args){
        JFrame f = new JFrame("Exemplo de Botão");
        JButton b = new JButton("CLICA AQUI");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(300, 600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Boa prática para fechar o programa ao fechar a janela
        f.setVisible(true);
    }
}