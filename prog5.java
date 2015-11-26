package uazz.swing;
 
import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;
 
 
public class MenuCheckBox extends JFrame{
     
    private JLabel statusbar;
     
    public MenuCheckBox(){
        pokazUI();
    }
     
    private void pokazUI(){
         
        JMenuBar menubar = new JMenuBar();
        JMenu plik = new JMenu("Plik");
        plik.setMnemonic(KeyEvent.VK_P);
         
        JMenu edycja = new JMenu("Edycja");
        edycja.setMnemonic(KeyEvent.VK_E);
         
        JCheckBoxMenuItem pokazStatusBar = new JCheckBoxMenuItem("Pokaż StatusBar");
        pokazStatusBar.setState(true);
        pokazStatusBar.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                if(statusbar.isVisible()){
                    statusbar.setVisible(false);
                }else{
                    statusbar.setVisible(true);
                }
            }
        });
         
        edycja.add(pokazStatusBar);
         
        menubar.add(plik);
        menubar.add(edycja);
         
        setJMenuBar(menubar);
         
        statusbar = new JLabel("StatusBar");
        statusbar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        add(statusbar,BorderLayout.SOUTH);
         
        setTitle("Pozycja menu CheckBox");
        setSize(380,270);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                MenuCheckBox mcb = new MenuCheckBox();
                mcb.setVisible(true);
            }
        });
    }
     
}