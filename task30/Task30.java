package task30;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task30{
    public static void main(String[] args) throws IOException{
    	
    	String filePath = "D:\\Install\\my.txt";
    	
    	int wordsCount = 0;
    	 List<String> lines = Files.readAllLines(Paths.get(filePath));
         for (String line : lines) {
             System.out.println(line);
             
             String[]  split = line.split(" ");
             wordsCount += split.length;
         }
         
         System.out.println("Words count:" + wordsCount);
    }
}