import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class RegisterForm extends JFrame {
    private JPanel panel1;
    private JButton Button1;
    private JTextField FIOField;
    private JPasswordField PINField;
    private JTextField currencyField;
    private JTextField dateField;
    private JTextField numberField;
    private JLabel FIOLabel;
    private JLabel CurrencyLabel;
    private JLabel DateLabel;
    private JLabel NumberLabel;
    private JLabel TypeLabel;
    private JLabel RegisterLabel;
    private JLabel PINLabel;
    private JRadioButton VISARadioButton;
    private JRadioButton masterCardRadioButton;
    private String type = "Visa";

    public RegisterForm(String title) throws HeadlessException, IOException {
        super(title);
        this.setSize(500, 500);
        this.setContentPane(new RegisterForm().panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public RegisterForm() {
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlasticCard plasticCard = new PlasticCard(FIOField.getText(), currencyField.getText(), dateField.getText(), Integer.parseInt(numberField.getText()), type, Integer.parseInt(PINField.getText()));
                try {
                    FileWriter writer =new FileWriter("GUI.txt", false);
                    writer.write(plasticCard.toString());
                    writer.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        VISARadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                type = "Visa";
            }
        });
        masterCardRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                type = "MasterCard";
            }
        });
    }
}
