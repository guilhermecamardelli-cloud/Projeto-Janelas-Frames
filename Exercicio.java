import java.net.URL;
import javax.swing.*;

public class Exercicio {
    public static void main(String[] args) {
        JFrame f = new JFrame("LERIGO");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        JButton b = new JButton("CLICA AQUI");
        b.setBounds(80, 70, 130, 30);

        b.addActionListener(e -> {
            if ("LERIGO".equalsIgnoreCase(JOptionPane.showInputDialog(f, "Digite LERIGO:"))) {
                JFrame img = new JFrame("Imagem");
                img.setSize(400, 400);
                img.setLocationRelativeTo(null);
                
                try {
                    img.add(new JLabel(new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgIhPjuec0RmD_c535K0rL4N4rM6a1MzwIWnO4RGjw0A&s=10"))));
                } catch (Exception ex) {
                    img.add(new JLabel("Erro ao carregar imagem"));
                }
                
                img.setVisible(true);
            }
        });

        f.add(b);
        f.setVisible(true);
    }
}