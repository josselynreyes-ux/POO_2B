import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel login_pa;
    private JTextField txtusuario;
    private JPanel mainPanel;
    private JTextField txtcontra;
    private JButton btnAcceso;

    private String usuario = "Justinpro";
    private String contra = "caramba";


    public Login() {
        setTitle("Pantalla Principal");
        setSize(300, 300);
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


        btnAcceso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtusuario.getText().equals(usuario) && txtcontra.getText().equals(contra)){
                    JOptionPane.showMessageDialog(null, "Verificación exitosa", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new Calculadora();
                    return;
                }
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtusuario.setText("");
                txtcontra.setText("");
            }
        });
    }

}

