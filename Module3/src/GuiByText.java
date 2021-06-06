import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiByText extends JFrame {

    JLabel label1 = new JLabel("Coba Input");
    JTextField textField1 = new JTextField();
    JButton buttom1 = new JButton("green");

    JLabel label12 = new JLabel("Panjang");
    JLabel label13 = new JLabel("Lebar");
    JLabel label14 = new JLabel("Hasil");
    JTextField tPanjang = new JTextField();
    JTextField tLebar = new JTextField();
    JTextField tHasil = new JTextField();
    JButton bHitung = new JButton("Hitung Luas");

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
        getContentPane().add(label12);
        getContentPane().add(label13);
        getContentPane().add(label14);
        getContentPane().add(tPanjang);
        getContentPane().add(tLebar);
        getContentPane().add(tHasil);
        getContentPane().add(bHitung);

        label1.setBounds(16, 32, 100, 25);
        textField1.setBounds(124,  32, 100, 25);
        buttom1.setBounds(232, 32, 80, 25);

        label12.setBounds(16, 80, 100, 25);
        tPanjang.setBounds(124, 80, 100, 25);
        label13.setBounds(16, 133, 100, 25);
        tLebar.setBounds(124, 133, 100, 25);
        bHitung.setBounds(16, 146, 208, 25);
        label14.setBounds(16, 179, 100, 25);
        tHasil.setBounds(124, 179, 100, 25);
    }

    void menambahkanListener(){
        buttom1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField1.getText();
                JOptionPane.showMessageDialog(null,"Hai " + nama );
            }
        });
        bHitung.addActionListener(ActionEvent -> {
            int panjang = Integer.parseInt(tPanjang.getText());
            int lebar = Integer.parseInt(tLebar.getText());

            int hasil = panjang * lebar;
            String sHasil = String.valueOf(hasil);

            tHasil.setText(sHasil);
        });
    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.meletakanKomponen();
        guiByText.setVisible(true);
    }

}
