package UserInterface.Form;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class EscaneoPanel extends JPanel {

    private JLabel messageLabel;
    public JTextField barcodeField;


    public EscaneoPanel(){
        setLayout(new BorderLayout());
        messageLabel = new JLabel(" ".repeat(103)+"Esperando a que escanee el código del producto...");
        add(messageLabel,BorderLayout.CENTER);

        barcodeField = new JTextField();
        barcodeField.setPreferredSize(new Dimension(0, 0)); // Ocultar el campo de texto
        add(barcodeField, BorderLayout.SOUTH);

        barcodeField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String barcode = barcodeField.getText();
                processBarcode(barcode);
                barcodeField.setText(""); // Limpiar el campo de texto después de procesar
            }
        });
    }
    
    private void processBarcode(String barcode) {
        messageLabel.setText("Código escaneado: " + barcode);
    }
}
