package Practice;

import java.util.GregorianCalendar;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class screenShotInJava {


	 public static void captureScreen(String fileName) throws Exception {
	       
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         Rectangle screenRectangle = new Rectangle(screenSize);
         Robot robot = new Robot();
         BufferedImage image = robot.createScreenCapture(screenRectangle);
         ImageIO.write(image, "jpeg", new File(fileName));
       
      }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 // create a gregorian calendar, which is an object
	      GregorianCalendar cal = new GregorianCalendar();

	      // clone object cal into object y
	      GregorianCalendar y = (GregorianCalendar) cal.clone();

	      // print both cal and y
	      System.out.println(y.getClass());
	      System.out.println("" + cal.getTime());
	      System.out.println("" + y.getTime());
	      captureScreen("ROB");
	}
	

}
