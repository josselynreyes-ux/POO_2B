import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario3 {
    private JPanel panel1;
    private JCheckBox leerCheckBox;
    private JCheckBox cocinarCheckBox;
    private JCheckBox tejerCrochetAgujasCheckBox;
    private JCheckBox deportesCheckBox;
    private JButton procesarInformaciónButton;


    public Formulario3() {
        procesarInformaciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder seleccion = new StringBuilder("Pasatiempos que seleccionastes:\n");

                if (leerCheckBox.isSelected()) {
                    seleccion.append("- Leer\n");
                }
                if (cocinarCheckBox.isSelected()) {
                    seleccion.append("- Cocinar\n");
                }
                if (tejerCrochetAgujasCheckBox.isSelected()) {
                    seleccion.append("- Tejer (crochet/agujas)\n");
                }
                if (deportesCheckBox.isSelected()) {
                    seleccion.append("- Deportes\n");
                }


                if (seleccion.toString().equals("Pasatiempos que seleccionastes:\n")) {
                    JOptionPane.showMessageDialog(panel1,
                            "No seleccionaste ningún pasatiempo.",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Mostrar selección
                JOptionPane.showMessageDialog(panel1,
                        seleccion.toString(),
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario3");
        frame.setContentPane(new Formulario3().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(605,245);
        frame.setVisible(true);
    }
}
