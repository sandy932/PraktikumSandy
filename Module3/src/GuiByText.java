import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiByText extends JFrame {

    JLabel label1 = new JLabel("Coba Input");
    JTextField textField1 = new JTextField();
    JButton buttom1 = new JButton("green");

    GuiByText(){
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("GUI By Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void meletakanKomponen(){
        getContentPane().setLayout(null);

        getContentPane().add(label1);
        getContentPane().add(textField1);
        getContentPane().add(buttom1);

        label1.setBounds(16, 32, 100, 25);
        textField1.setBounds(124,  32, 100, 25);
        buttom1.setBounds(232, 32, 80, 25);
    }

    void menambahkanListener(){
        buttom1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField1.getText();
                JOptionPane.showMessageDialog(null,"Hai " + nama );
            }
        });
    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.meletakanKomponen();
        guiByText.setVisible(true);
    }

}
