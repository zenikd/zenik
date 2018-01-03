package filesample;

import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\new.txt");
		System.out.println("file exist:" + file.exists());
		
		if(file.exists()) {
			
			System.out.println("file has created before");
		} else {
			file.createNewFile();
			System.out.println("file created");
		}
		
		file
	}

}
