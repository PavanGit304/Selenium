package Buffer;

import java.io.*;

public class bufferwriter {
/* It makes the performance fast. The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.
 *  OR
 *  it creates separate file for the written text   */	
	public static void main(String args[]){
		try{//it creates new k file 
			BufferedWriter out =new BufferedWriter(new FileWriter("D:\\downloads\\html\\vijya4.html)"));
			out.write("created by pavan");
			out.close();
			System.out.println("file created succeess");
		}
		catch(IOException e){
			System.out.println(e);
			}
	}

}
