package Solutions;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * Reads data from a file
 */
public final class FileReader {
 public static ArrayList<String> readFile(String path){
	  ArrayList<String> D1 = null;
	  try {
	   D1= new ArrayList<>(Files.readAllLines(Paths.get(path)));
	  } catch(IOException e) {
		  System.out.println("File not found");
		  e.printStackTrace();
	  }
	  return D1;
 }
}