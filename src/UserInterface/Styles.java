package UserInterface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.net .URL;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public abstract class Styles {
    public static final Color COLOR_FONT = new Color (0, 0, 0);
    public static final Color COLOR_FONT_LIGHT = new Color (100, 100, 100);
    public static final Color COLOR_CURSOR = Color.black;
    public static final Color COLOR_BORDER = Color.lightGray;
    public static final Font FONT = new Font("JetBrains Mono", Font.PLAIN, 14);
    public static final Font FONT_BOLD = new Font ("JetBrains Mono", Font.BOLD | Font.PLAIN, 14);
    public static final Font FONT_SMALL  = new Font("JetBrains Mono", Font.PLAIN | Font.PLAIN, 10);

    public static final int ALIGNMENT_LEFT  = SwingConstants.LEFT  ;
    public static final int ALIGNMENT_RIGHT = SwingConstants.RIGHT ;
    public static final int ALIGNMENT_CENTER= SwingConstants.CENTER;

    public static final Cursor Cursor_HAND    = new Cursor(Cursor.HAND_CURSOR);
    public static final Cursor Cursor_DEFAULT = new Cursor (Cursor.DEFAULT_CURSOR);

    public static final URL URL_FONDO  = Styles.class.getResource("/UserInterface/Resources/Img/fondo.jpg");
    public static final URL URL_BOTON  = Styles.class.getResource("/UserInterface/Resources/Img/botton.png");
    public static final URL URL_MAIN   = Styles.class.getResource("/UserInterface/Resources/Img/prjIMG.jpg");
    public static final URL URL_LOGO   = Styles.class.getResource("/UserInterface/Resources/Img/Logo.jpg");
    public static final URL URL_SPLASH = Styles.class.getResource("/UserInterface/Resources/Img/Splash.jpg");
    
    public static final CompoundBorder createBorderRect(){
        return BorderFactory.createCompoundBorder(new LineBorder(Color.lightGray),
                                                  new EmptyBorder(5, 5, 5,5));
    }

    public static final void showMsg(String msg){
        JOptionPane.showMessageDialog(null, msg, "🐶 PRODUCTOS", JOptionPane.INFORMATION_MESSAGE);
    }    

    public static final void showMsgError(String msg){
        JOptionPane.showMessageDialog(null, msg, "🦁 PRODUCTOS", JOptionPane.OK_CANCEL_OPTION);
    }

    public static final boolean showConfirmYesNo(String msg){
        return (JOptionPane.showConfirmDialog(null, msg, "🤡 PRODUCTOS", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION);
    }
}
