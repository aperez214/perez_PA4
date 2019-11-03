package perez_p1;
import java.io.*;

public class Application {

	public static void main (String[] args) throws IOException {
		
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
			duplicateRemover.remove();
			duplicateRemover.write();
	}
	
}
