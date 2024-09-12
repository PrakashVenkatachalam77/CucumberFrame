package testNGDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
	
	public static void main(String[] args) throws IOException {
		
		 File ac = new File("C:\\Users\\baska\\git\\repository\\ProjectName\\src\\test\\resources\\GlobalFiles.properties\\test.properties");
		
	     FileReader f= new FileReader(ac);
	     
	     Properties a= new Properties();
	     
	     a.load(f);
	     
	     System.out.println(a.getProperty("Url"));
	}
	
	

}
