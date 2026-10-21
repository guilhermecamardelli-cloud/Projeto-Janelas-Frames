import javax.swing.*;

public class ExemploSwing extends JFrame {
    public ExemploSwing(){
        super("Exemplo JSwing Frame");
        final JLabel label = new JLabel ("Exemplo Swing Frame AGOSTO 2021");
        getContentPane().add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ExemploSwing frame = new ExemploSwing();
    }
} 