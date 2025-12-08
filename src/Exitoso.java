import javax.swing.*;

public class Exitoso extends JFrame{
    private JPanel mainPanel2;


    public Exitoso(){
        setTitle("Pantalla Principal");
        setSize(400, 300);
        setContentPane(mainPanel2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
