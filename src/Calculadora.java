import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JPanel mainPanel2;
    private JTextField txtValor1;
    private JTextField txtValor2;
    private JTextField txtResultado;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;

    public Calculadora(){
        setTitle("Pantalla Principal");
        setSize(400, 400);
        setContentPane(mainPanel2);
        setLocationRelativeTo(null);
        setVisible(true);

        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(txtValor1.getText());
                    Double valor2 = Double.parseDouble(txtValor2.getText());
                    Double suma= valor1 + valor2;
                    txtResultado.setText(String.valueOf(suma));
                } catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Solo se permiten numeros", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(txtValor1.getText());
                    Double valor2 = Double.parseDouble(txtValor2.getText());
                    Double suma= valor1 - valor2;
                    txtResultado.setText(String.valueOf(suma));
                } catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Solo se permiten numeros", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(txtValor1.getText());
                    Double valor2 = Double.parseDouble(txtValor2.getText());
                    Double suma= valor1 * valor2;
                    txtResultado.setText(String.valueOf(suma));
                } catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Solo se permiten numeros", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double valor1 = Double.parseDouble(txtValor1.getText());
                    Double valor2 = Double.parseDouble(txtValor2.getText());
                    if (valor2==0){
                        JOptionPane.showMessageDialog(null, "no se puede dividir para 0", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    Double suma= valor1 / valor2;
                    txtResultado.setText(String.valueOf(suma));
                } catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Solo se permiten numeros", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
