package View;
import javax.swing.*;
import java.awt.*;
public class Panel extends JPanel {
    private JLabel etiquetaNombre;
    private JTextField campoNombre;
    private JLabel etiquetaContrasenna;
    private JPasswordField campoContrasenna;
    private JButton loginBoton;

    public Panel() {
        initComponents();
        
    }
    private void initComponents() {

        setLayout(null);
        etiquetaNombre = new JLabel();
        campoNombre = new JTextField();
        etiquetaContrasenna = new JLabel();
        campoContrasenna = new JPasswordField();
        loginBoton = new JButton();

        etiquetaNombre.setBackground(new Color(204, 255, 51));
        etiquetaNombre.setFont(new Font("Cooper Black", 2, 18)); 
        etiquetaNombre.setForeground(new Color(51, 51, 51));
        etiquetaNombre.setText("Nombre");
        etiquetaNombre.setBounds(150, 40, 80, 22);

        campoNombre.setFont(new Font("Cooper Black", 1, 11));
        campoNombre.setBounds(70, 90, 250, 20);

        etiquetaContrasenna.setFont(new Font("Cooper Black", 2, 18)); 
        etiquetaContrasenna.setForeground(new Color(51, 51, 51));
        etiquetaContrasenna.setText("Contraseña");
        etiquetaContrasenna.setBounds(140, 150, 110, 30);

        campoContrasenna.setFont(new Font("Cooper Black", 2, 11)); 
        campoContrasenna.setBounds(70, 220, 250, 20);

        loginBoton.setFont(new java.awt.Font("Cooper Black", 2, 18)); // NOI18N
        loginBoton.setForeground(new java.awt.Color(51, 51, 51));
        loginBoton.setText("Aceptar");
        loginBoton.setBounds(140, 260, 110, 31);
        

        add(etiquetaNombre);
        add(etiquetaContrasenna);
        add(campoNombre);
        add(campoContrasenna);
        add(loginBoton);
}
}
