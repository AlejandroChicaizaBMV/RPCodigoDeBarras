package UserInterface.CustomerControl;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import UserInterface.Styles;

public class PrjButton extends JButton implements MouseListener {

    public PrjButton(String text){
    }

    public void customizeComponent(String text, String iconPath){

        setSize(20,70);
        addMouseListener(this);
        customizeComponent(text);
        setBounds(50, 30, 90, 20);
        
        setIcon(new ImageIcon(iconPath));
        setFont(Styles.FONT);
    }

    public void customizeComponent(String text){
        setText(text);
        setOpaque(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);

        setForeground(Styles.COLOR_FONT);
        setHorizontalAlignment(Styles.ALIGNMENT_LEFT);
        setFont(Styles.FONT);

        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setForeground(Color.BLACK);
        setCursor(Styles.Cursor_HAND);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(Color.GRAY);
        setCursor(Styles.Cursor_DEFAULT);
    }

}
