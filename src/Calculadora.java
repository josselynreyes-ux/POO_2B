import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JPanel mainPanel;
    private JTextField txtValor1;
    private JTextField txtValor2;
    private JTextField txtResultado;
    private JButton btnSumar;
    private JButton btnDividir;
    private JButton btnRestar;
    private JButton btnMultiplicar;

    public Calculadora() {
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double numero1 = Double.parseDouble(txtValor1.getText());
                    Double numero2 = Double.parseDouble(txtValor2.getText());
                    Double resultado = numero1+numero2;

                    txtResultado.setText(String.valueOf(resultado));
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Debe ingresar solamente numeros" ,
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double numero1 = Double.parseDouble(txtValor1.getText());
                    Double numero2 = Double.parseDouble(txtValor2.getText());
                    Double resultado = numero1-numero2;

                    txtResultado.setText(String.valueOf(resultado));
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Debe ingresar solamente numeros", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double numero1 = Double.parseDouble(txtValor1.getText());
                    Double numero2 = Double.parseDouble(txtValor2.getText());
                    Double resultado = numero1*numero2;

                    txtResultado.setText(String.valueOf(resultado));
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Debe ingresar solamente numeros", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double numero1 = Double.parseDouble(txtValor1.getText());
                    Double numero2 = Double.parseDouble(txtValor2.getText());
                    if (numero2 == 0){
                        JOptionPane.showMessageDialog(null, "No se puede dividir para cero", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    Double resultado = numero1/numero2;
                    txtResultado.setText(String.valueOf(resultado));
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Debe ingresar solamente numeros", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(605,245);
        frame.setVisible(true);
    }
}
