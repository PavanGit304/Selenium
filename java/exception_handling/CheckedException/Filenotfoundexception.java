package CheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filenotfoundexception {
	
    public static void main(String args[])  { 
        try { 
            // Following file does not exist 
            File file = new File("E://Selenium.docx"); // E://file.txt
            FileReader fr = new FileReader(file); 
        } catch (FileNotFoundException e) { 
           System.out.println("File does not exist"+"\n"+e); 
        } 
    } 
    
    
    
}
