package perez_p2;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class DuplicateCounter {

	
	public 	ArrayList<String> wordCounter = new ArrayList<String>();

	
	@SuppressWarnings("resource")
	public void count() throws IOException {
				
	    ArrayList<String> strInput = new ArrayList<String>();
	    ArrayList<Integer> intInput = new ArrayList<Integer>();

		int i = 0;
		int j = 0;
		int count = 0;

		FileInputStream dataFile = new FileInputStream("problem2.txt");
		
		Scanner inFS = new Scanner(dataFile);
			
	    while (inFS.hasNext()) {

	    	strInput.add(inFS.next());
	    	i++;
	    	
	    }
	    
	    for (i = 0; i < strInput.size(); i++) {
	    	
	    	intInput.add(0);
	    	
	    	for (j = i + 1; j < strInput.size(); j++) {
	    		
	    		
	    		if (strInput.get(i).compareTo(strInput.get(j)) == 0) {
	    			wordCounter.add(strInput.get(j));
	    			strInput.remove(j);
	    			count++;

	    		}


	    	}
    		intInput.set(i, count);

	    }
	    
		dataFile.close();
		
		System.out.println(intInput);
		
	}

	
	public void write() throws IOException {
		
		int i = 0;
		
		FileOutputStream outputFile = new FileOutputStream("unique_words_counts.txt");
		PrintWriter outFS = new PrintWriter(outputFile);	
	    	
		for (i = 0; i < wordCounter.size(); i++)
			
			outFS.println(wordCounter.get(i));
	    
		outFS.flush();
		outputFile.close();

		}
	
		
}
