package UserInterface.Form;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterface.Styles;
import UserInterface.CustomerControl.PrjButton;

public class MenuPanel extends JPanel{

    public static JButton
    btnCliente              = new JButton("Modo Cliente"),
    btnAdministrador        = new JButton("Administrar");

    public static JPanel ButtonPanel = new JPanel();

    public MenuPanel(){
        customizeComponent();
    }

    public void customizeComponent (){
        setLayout(new BorderLayout());
        ButtonPanel.setLayout(new FlowLayout());

        btnCliente.setMargin(new Insets(10, 20, 10, 20));
        btnAdministrador.setMargin(new Insets(10, 20, 10 ,20));

        ButtonPanel.add(btnCliente);
        ButtonPanel.add(btnAdministrador);
        ButtonPanel.add(new JLabel("\u00A9 2024 Prometeo"));
        
        setPreferredSize(new Dimension(300, getHeight()));

        try {
            ImageIcon logo = new ImageIcon(Styles.URL_LOGO); 
            JLabel    lblLogo = new JLabel(logo);
            add(lblLogo, BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }

        add(ButtonPanel, BorderLayout.SOUTH);
    }
}
