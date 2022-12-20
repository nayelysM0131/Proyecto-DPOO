package View;
import javax.swing.*;
public class VentanaLogin extends JFrame{

    public VentanaLogin(){

        setTitle("HUMAJU");
        setBounds(300, 50, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Panel loginPanel = new Panel();
        add(loginPanel);
        setSize(getHeight()+1,getWidth()+1);
        setSize(getHeight()-1,getWidth()-1);
    }
    
}
