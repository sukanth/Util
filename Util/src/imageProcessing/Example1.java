package imageProcessing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example1 extends JPanel {

   public void paint(Graphics g) {
      Image img = createImageWithText();
      g.drawImage(img, 70,70,this);
   }

   private Image createImageWithText(){
      BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB); 
      Graphics g = bufferedImage.getGraphics();
      g.drawString("SUKANTH", 20, 120);
      g.drawString("www.example.com", 20,20);
      g.drawString("www.example.com", 20,40);
      g.drawString("www.example.com", 20,60);
      g.drawString("www.example.com", 20,80);
      g.drawString("www.example.com", 20,100);
      
      return bufferedImage;
   }
   
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.getContentPane().add(new Example1());

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 500);
      frame.setVisible(true);
   }
}