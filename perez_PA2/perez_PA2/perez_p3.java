package perez_PA2;

import java.util.Scanner;

public class perez_p3 {
	
	public static void main (String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] arrayTopics = new String[5];
		String maxTopic = null;
		String minTopic = null;
		int[][] arrayResponses = new int[5][10];
		int i, j, k, NULL,
				surveyCount = 0;
		double pollTally, avgPoll,
				maxPoll = 0, 
				minPoll = 10;
		char N, n;
		
		arrayTopics[0] = "Health";
		arrayTopics[1] = "Wealth";
		arrayTopics[2] = "Happinness";
		arrayTopics[3] = "Food";
		arrayTopics[4] = "Shelter";
		
		do {
			for (i = 0; i <= 4; i++) {
				System.out.print("Rate the importance of " + arrayTopics[i] + " from 1 to 10: ");
					j = (scnr.nextInt() - 1);
					arrayResponses[i][j] = arrayResponses[i][j] + 1;
				}
			System.out.print("\nWould you like to submit another survey (Y/N)? ");
			NULL = scnr.next().charAt(0);
			surveyCount++;
			
			} while (NULL != 'N');
		
		System.out.print("\n\n");
		System.out.println("\tRating: |1 2 3 4 5 6 7 8 9 10\tAvg:");
		System.out.println("Topic:\t\t|");
		System.out.println("________________|____________________\t____");

			for (i = 0; i <= 4; i++) {
					System.out.print(arrayTopics[i] + "\t");
					if (i == 2)
							System.out.print("|");
					if (i != 2)
							System.out.print("\t|");
					pollTally = 0;
				for (j = 0; j <= 9; j++) {
					System.out.print(arrayResponses[i][j] + " ");	
					pollTally = pollTally + ((j+1) * arrayResponses[i][j]);

				}
					avgPoll = pollTally / surveyCount;
					System.out.printf("\t%.2f", avgPoll);
					System.out.print("\n");
					
					if (avgPoll > maxPoll) {
						maxPoll = avgPoll;
						maxTopic = arrayTopics[i];
					}
					
					if (avgPoll <= minPoll) {
						minPoll = avgPoll;
						minTopic = arrayTopics[i];
					}
			}
			
			System.out.printf("\nMax Poll: %s  (%.2f)", maxTopic, maxPoll);
			System.out.printf("\nMin Poll: %s  (%.2f)", minTopic, minPoll);
	}
}
