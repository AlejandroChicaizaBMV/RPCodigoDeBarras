package UserInterface.Form;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainForm extends JFrame {
    
    MenuPanel pnlMenu = new MenuPanel();
    JPanel pnlNuevo;
    EscaneoPanel escaneoPanel = new EscaneoPanel();
     
    public MainForm(String titleApp){
        customizeComponent(titleApp);
        MenuPanel.btnCliente.addActionListener(e -> {
   
            setPanel(escaneoPanel);
            escaneoPanel.barcodeField.requestFocusInWindow();
        });
        MenuPanel.btnAdministrador.addActionListener(e -> setPanel(new LoginPanel())); 
    }

    private void setPanel(JPanel formularioPanel){
        Container container = getContentPane();
        container.removeAll();
        pnlNuevo = formularioPanel;
        container.add(pnlNuevo);
        revalidate();
        repaint();
    }

    private void customizeComponent(String titleApp){
        setTitle(titleApp);
        setSize(1000, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout()); 
        
        container.add(pnlMenu, BorderLayout.CENTER);

        setVisible(true);
    }
}

