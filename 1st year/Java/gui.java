import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gui extends JFrame implements ActionListener {

    
    public gui(){
        JFrame window = new JFrame();
        JPanel buttons = new JPanel();
        
        JButton sparenButton = new JButton("Sparen!");
        sparenButton.setBounds(10,40,150,40);
        JButton ausgabenButton = new JButton("Ausgaben!");
        ausgabenButton.setBounds(10,90,150,40);
        JButton taschengeldButton = new JButton("Taschengeld!");
        taschengeldButton.setBounds(10,140,150,40);
        JTextField input = new JTextField("");
        input.setBounds(170,40,446,140);
        input.setSize(400,200);
        buttons.add(sparenButton);
        buttons.add(ausgabenButton);
        buttons.add(taschengeldButton);
        buttons.add(input);
        window.setSize(1000,700);
        window.add(buttons);
        window.add(input);
        window.setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent event){

    }

    public static void main(String[] args){
        gui f = new gui();
    }

}