package perez_p2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;


public class DuplicateCounter {

	
	public 	ArrayList<Integer> wordCounter = new ArrayList<Integer>();
    public	ArrayList<String> strInput = new ArrayList<String>();

	
	@SuppressWarnings("resource")
	public void count() throws IOException {
			
		int i = 0;
		int j = 0;

		FileInputStream dataFile = new FileInputStream("problem2.txt");
		
		Scanner inFS = new Scanner(dataFile);
			
	    while (inFS.hasNext()) {

	    	strInput.add(inFS.next());
	    	i++;
	    	
	    }
	    
	    for (i = 0; i < strInput.size(); i++) {
	    	
    		wordCounter.add(Collections.frequency(strInput, strInput.get(i)));

	    	for (j = i + 1; j < strInput.size(); j++) {
	    		
	    		if (strInput.get(i).compareTo(strInput.get(j)) == 0) {
	    			
	    			strInput.remove(j);
	    			
	    		}


	    	}
	    	
	 
	    }
	    
		dataFile.close();
		
		System.out.println(wordCounter);
		System.out.println(strInput);

	}

	
	public void write() throws IOException {
		
		int i = 0;
		
		FileOutputStream outputFile = new FileOutputStream("unique_word_counts.txt");
		PrintWriter outFS = new PrintWriter(outputFile);	
	    	
		for (i = 0; i < wordCounter.size(); i++) {
							
				
					outFS.println(strInput.get(i) + ": "+ wordCounter.get(i));
				
				}
	
		
		outFS.flush();
		outputFile.close();
		
		}
	
		
}
