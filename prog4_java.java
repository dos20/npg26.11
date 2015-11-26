package uazz.swing;
 
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
 
import javax.swing.*;
 
public class PaskiNarzedzi extends JFrame{
     
    public PaskiNarzedzi(){
        pokazUI();
    }
     
    public final void pokazUI(){
         
        JToolBar tbar1 = new JToolBar();
        JToolBar tbar2 = new JToolBar();
         
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
         
        ImageIcon ikoNowy = new ImageIcon("nowy.png");
        ImageIcon ikoOtworz = new ImageIcon("otworz.png");
        ImageIcon ikoZapisz = new ImageIcon("zapisz.png");
        ImageIcon ikoWyjscie = new ImageIcon("wyjscie.png");
         
        JButton btnNowy = new JButton(ikoNowy);
        JButton btnOtworz = new JButton(ikoOtworz);
        JButton btnZapisz = new JButton(ikoZapisz);
         
        tbar1.add(btnNowy);
        tbar1.add(btnOtworz);
        tbar1.add(btnZapisz);
        tbar1.setAlignmentX(0);
         
        JButton btnWyjscie = new JButton(ikoWyjscie);
        tbar2.add(btnWyjscie);
        tbar2.setAlignmentX(0);
         
        btnWyjscie.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
         
        panel.add(tbar1);
        panel.add(tbar2);
         
        add(panel,BorderLayout.NORTH);
         
        setTitle("Paski narzędzi");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args){
         
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                PaskiNarzedzi pn = new PaskiNarzedzi();
                pn.setVisible(true);
            }
        });
    }
}