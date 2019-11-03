package perez_p2;
import java.io.*;

public class Application {

	public static void main (String[] args) throws IOException {
		
		DuplicateCounter duplicateRemover = new DuplicateCounter();
		
			duplicateRemover.count();
			duplicateRemover.write();
			

	}
	
}
