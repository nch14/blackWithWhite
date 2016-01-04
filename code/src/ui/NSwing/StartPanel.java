package ui.NSwing;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import main.StartFrame;

public class StartPanel extends JPanel {
	StartFrame belongsTO;
	public StartPanel(StartFrame belongsTO){
		this.belongsTO=belongsTO;
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
	}
	
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image;
        try {
            image = ImageIO.read(new File("pic/logo.png"));
            g.drawImage(image, 380, 150, this);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
     
       
    }
}
