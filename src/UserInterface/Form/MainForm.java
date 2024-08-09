package UserInterface.Form;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainForm extends JFrame {
    
    MenuPanel pnlMenu = new MenuPanel();
    JPanel pnlNuevo;
    EscaneoPanel escaneoPanel = new EscaneoPanel();
    BorderLayout borderLayout;

    public MainForm(String titleApp, boolean registroSuperAdmin){
        if(registroSuperAdmin == false){

        }else{
            customizeComponent(titleApp);
            pnlMenu.btnCliente.addActionListener(e -> {
       
                setPanel(escaneoPanel);
                escaneoPanel.barcodeField.requestFocusInWindow();
            });
            pnlMenu.btnAdministrador.addActionListener(e -> setPanel(new LoginPanel())); 
        }
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
        setSize(736, 420);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        borderLayout = new BorderLayout();
        container.setLayout(borderLayout); 
        
        container.add(pnlMenu, BorderLayout.CENTER);

        setVisible(true);
    }
}

