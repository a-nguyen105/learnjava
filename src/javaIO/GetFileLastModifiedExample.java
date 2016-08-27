package javaIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class GetFileLastModifiedExample {
 public static void main(String[] args){
	 File file = new File("/Users/anhtuan/Documents/workspace/vidu/getmodifilefile.txt");
	 try{
	 if(!file.exists()){
		 file.createNewFile();
	 }
	 }catch(IOException e){
		 e.printStackTrace();
	 }
	 System.out.println("Before format : " + file.lastModified());
	 
	 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
	 
	 System.out.println("After Format: " + sdf.format(file.lastModified()));
 }
}
