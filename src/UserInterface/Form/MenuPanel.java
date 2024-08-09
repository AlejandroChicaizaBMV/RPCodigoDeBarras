package UserInterface.Form;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterface.Styles;
import UserInterface.CustomerControl.PrjButton;

public class MenuPanel extends JPanel{

    public PrjButton
    btnCliente              = new PrjButton("Escanear"),
    btnAdministrador        = new PrjButton("Administrar");

    FlowLayout flowLayout;
    private Image fondo;

    public static JPanel ButtonPanel = new JPanel();

    public MenuPanel(){
        customizeComponent();
    }

    public void customizeComponent (){
        this.fondo = new ImageIcon(Styles.URL_FONDO).getImage();
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 300));
         
        add(btnCliente);
        add(btnAdministrador);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }
}
