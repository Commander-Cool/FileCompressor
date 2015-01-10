import java.io.File;
import java.util.Formatter;
import java.util.Scanner;


public class FileManagement {
	static Scanner x = null; 
	
	public static Scanner openFile(){
		try{
			x=new Scanner (new File("C:\\Users\\Jay Kumar\\Documents\\Java Workspace\\fred.txt"));
		}
		catch (Exception error){
			System.out.println("File Not Found");
		}
		return x;
	}
	
	public static String readFile(Scanner File){
		String string=null;
		while (x.hasNext()){
			string=x.next();
		}
		return string;
	}
	
	
	
	public Formatter writeFile(Formatter x,String string){
		x.format("%s", string);
		return x;
		}
}
