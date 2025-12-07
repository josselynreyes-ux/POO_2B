import javax.swing.*;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Encuesta {
    private JPanel panel1;
    private JRadioButton síRadioButton;
    private JRadioButton noMuchoRadioButton;
    private JRadioButton noRadioButton;
    private JRadioButton síRadioButton1;
    private JRadioButton noMuchoRadioButton1;
    private JRadioButton noRadioButton1;
    private JRadioButton síRadioButton2;
    private JRadioButton noMuchoRadioButton2;
    private JRadioButton noRadioButton2;
    private JButton enviarRespuestasButton;

    public Encuesta (){
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(síRadioButton);
        grupo1.add(noMuchoRadioButton);
        grupo1.add(noRadioButton);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(síRadioButton1);
        grupo2.add(noMuchoRadioButton1);
        grupo2.add(noRadioButton1);

        ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(síRadioButton2);
        grupo3.add(noMuchoRadioButton2);
        grupo3.add(noRadioButton2);


        enviarRespuestasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String respuesta1 = "";
                if (síRadioButton.isSelected()) respuesta1 = "Sí";
                else if (noMuchoRadioButton.isSelected()) respuesta1 = "No mucho";
                else if (noRadioButton.isSelected()) respuesta1 = "No";

                String respuesta2 = "";
                if (síRadioButton1.isSelected()) respuesta2 = "Sí";
                else if (noMuchoRadioButton1.isSelected()) respuesta2 = "No mucho";
                else if (noRadioButton1.isSelected()) respuesta2 = "No";

                String respuesta3 = "";
                if (síRadioButton2.isSelected()) respuesta3 = "Sí";
                else if (noMuchoRadioButton2.isSelected()) respuesta3 = "No mucho";
                else if (noRadioButton2.isSelected()) respuesta3 = "No";

                String resultado = "Resultado de la encuesta de Joss :3 \n" +
                        "1. ¿Te gustan los dulces?: " + respuesta1 + "\n" +
                        "2. ¿Te gustan los gatos?: " + respuesta2 + "\n" +
                        "3. ¿Te gustaría viajar a Japón?: " + respuesta3;

                JOptionPane.showMessageDialog(null, resultado);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Encuesta");
        frame.setContentPane(new Encuesta().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(605,245);
        frame.setVisible(true);
    }
}


