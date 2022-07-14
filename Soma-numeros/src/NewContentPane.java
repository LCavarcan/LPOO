
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuizaCavarcan
 */
public class NewContentPane extends JPanel {
    
    Image im = new ImageIcon ( getClass ( ).getResource ( "/fundo.png" ) ).getImage ( );

    public void paintComponent ( Graphics g )   
    {   
        super.paintComponent( g );   
        int x = ( this.getWidth ( ) - im.getWidth ( null ) ) / 2;   
        int y = ( this.getHeight ( ) - im.getHeight ( null ) ) / 2;   
        g.drawImage ( im , x , y , this );   
    }   
}
