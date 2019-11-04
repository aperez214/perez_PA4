package perez_p2;
import java.io.*;
import java.util.Collections;

public class Application {

	public static void main (String[] args) throws IOException {
		
		DuplicateCounter duplicateRemover = new DuplicateCounter();
		
			duplicateRemover.count();
			duplicateRemover.write();
			

	}
	
}


//	System.out.println(strInput.get(i) + ": " + Collections.frequency(wordCounter, wordCounter.get(i)));