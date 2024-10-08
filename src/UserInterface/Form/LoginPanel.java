package UserInterface.Form;

import java.awt.*;
import javax.swing.*;

import UserInterface.CustomerControl.PrjLabel;
import UserInterface.CustomerControl.PrjLabelText;
import UserInterface.CustomerControl.PrjTextBox;

public class LoginPanel extends JPanel {

    private PrjLabel        lblUsername, lblPassword;
    private PrjTextBox      txtUsername;
    private JPasswordField  txpPassword;
    private JButton         btnLogin;
    private PrjLabelText    pltDirecccion;

    public LoginPanel() {
        initializeComponents();
        btnLogin.addActionListener(e -> btnLoginClick());  //usando expresiones lambda
        // btnLogin.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         btnLoginClick();
        //     }
        // });
    }

    private void btnLoginClick() {
        String username = txtUsername.getText();
        char[] password = txpPassword.getPassword();

        JOptionPane.showMessageDialog(LoginPanel.this, "Usuario: " + username + "\nContraseña: " + new String(password), "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);

        txtUsername.setText("");
        txpPassword.setText("");
    }

    private void initializeComponents() {
        lblUsername = new PrjLabel("Username:");
        lblPassword = new PrjLabel("Password:");
        txtUsername = new PrjTextBox();
        txpPassword = new JPasswordField();
        btnLogin    = new JButton("Login");
        pltDirecccion = new PrjLabelText("Dirección:");

        //txtUsername.setBorder(txtUsername.createBorderLine());
        txtUsername.setBorderLine();

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Márgenes entre componentes

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(lblUsername, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(txtUsername, gbc);

        // Etiqueta y campo de texto para la contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(lblPassword, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(txpPassword, gbc);

        // Botón de login en la fila 2
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnLogin, gbc);


        // Botón de login en la fila 2
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        add(pltDirecccion, gbc);
        
    }

}
