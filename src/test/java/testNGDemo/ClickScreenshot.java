package testNGDemo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ClickScreenshot {

	public static void click() throws AWTException, IOException {
    Robot r= new Robot();

		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

		Rectangle rect= new Rectangle(d);

		BufferedImage b = r.createScreenCapture(rect);

		File destination= new File("./screenshot/screen"+System.currentTimeMillis()+".png");

		ImageIO.write(b,"png",destination);

	}

}
