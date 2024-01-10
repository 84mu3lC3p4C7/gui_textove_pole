import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DemoTextovePole extends JFrame {
    private JTextField txt_Input;
    private JButton btnGenerate;
    private JTextArea txt_Output;
    private JButton btnCopy;
    private JLabel lblRandomNumber;
    private JLabel lblOutput;
    private JPanel MainPanel;

    public DemoTextovePole() {
        txt_Output.setEnabled(false);
        txt_Output.setDisabledTextColor(Color.black);
        btnGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random generator = new Random();
                txt_Input.setText(String.valueOf(generator.nextInt(100)));
            }
        });
        btnCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_Output.setText(txt_Output.getText() + "\n" + txt_Input.getText());
            }
        });
    }

    public static void main(String[] args) {
        DemoTextovePole demoTextovePole = new DemoTextovePole();
        demoTextovePole.setContentPane(demoTextovePole.MainPanel);
        demoTextovePole.setDefaultCloseOperation(EXIT_ON_CLOSE);
        demoTextovePole.setTitle("Test práce s tlačítky");
        demoTextovePole.setSize(450, 400);
        demoTextovePole.setVisible(true);
    }
}
