package perez_p1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class DuplicateRemover {

	
	public 	ArrayList<String> uniqueWords = new ArrayList<String>();

	
	@SuppressWarnings("resource")
	public void remove() throws IOException {
				
	    ArrayList<String> strInput = new ArrayList<String>();
		int i = 0;
		int j = 0;

		FileInputStream dataFile = new FileInputStream("problem1.txt");
		
		Scanner inFS = new Scanner(dataFile);
			
	    while (inFS.hasNext()) {

	    	strInput.add(inFS.next());
	    	i++;
	    	
	    }
	    
	    for (i = 0; i < strInput.size(); i++) {
	    	
	    	for (j = i + 1; j < strInput.size(); j++) {
	    		
	    		if (strInput.get(i).compareTo(strInput.get(j)) == 0) {
	    			uniqueWords.add(strInput.get(j));
	    			strInput.remove(j);
	    		}
	    		
	    	}
	    	
	    }
	    
		dataFile.close();
	    
		FileOutputStream updatedFile = new FileOutputStream("problem1.txt");
		PrintWriter outFS = new PrintWriter(updatedFile);
		
	    for (i = 0; i < strInput.size(); i++) {
	    	
	    	outFS.println(strInput.get(i));
	    }
	    
		outFS.flush();
		updatedFile.close();

	}

	
	public void write() throws IOException {
		
		int i = 0;
		
		FileOutputStream outputFile = new FileOutputStream("unique_words.txt");
		PrintWriter outFS = new PrintWriter(outputFile);	
	    	
		for (i = 0; i < uniqueWords.size(); i++)
			
			outFS.println(uniqueWords.get(i));
	    
		outFS.flush();
		outputFile.close();
		
		}
	
		
}
