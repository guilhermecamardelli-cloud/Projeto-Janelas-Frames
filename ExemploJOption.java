
import javax.swing.JOptionPane;

public class ExemploJOption {
    
    public static void main(String[] args) {
        
        int input = JOptionPane.showConfirmDialog(null, "Você gosta de maçã?" );
        // 0=SIM, 1=NÃO, 2=CANCELAR

        System.err.println(input);
    }
}
