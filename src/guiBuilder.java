import javax.swing.*;
import java.awt.event.*;
import nameVar.basicVars;

public class guiBuilder extends JFrame {
    private JLabel jLabel;
    private JPanel jPanel;
    private JButton jButton;
    private JTextField jTextField;

    public guiBuilder() {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(guiBuilder.this, basicVars.messageDialogMessage);
            }
        });
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jTextField.getText());;
            }
        });
    }

    public void createUIComponents() {
        setContentPane(jPanel);
        setTitle(basicVars.title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();


    }
}
