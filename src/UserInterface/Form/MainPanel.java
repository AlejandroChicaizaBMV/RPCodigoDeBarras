package UserInterface.Form;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterface.Styles;

public class MainPanel extends JPanel {

    public MainPanel(){
        customizeComponent();
    }
    
    private void customizeComponent(){
        try {
            ImageIcon imageIcon = new ImageIcon(Styles.URL_MAIN); 
            add(new JLabel(imageIcon),BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
