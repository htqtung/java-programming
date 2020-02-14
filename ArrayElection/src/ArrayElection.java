import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String textInput;
		int numInput;
		System.out.print("Enter the number of candidates: ");
		int numOfCandidate = Integer.parseInt(input.nextLine());
		Candidate[] candidateList = new Candidate[numOfCandidate];
		for (int i = 0; i < candidateList.length; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			textInput = input.nextLine();
			System.out.print("Enter votes: ");
			numInput = Integer.parseInt(input.nextLine());
			candidateList[i] = new Candidate(textInput, numInput);
		}
		int winnerIndex = 0;
		for (int i = 1; i < candidateList.length; i++) {
			if (candidateList[winnerIndex].getVote() < candidateList[i].getVote()) {
				winnerIndex = i;
			}
		}
		int tieFlag = 0;
		for (int i = 0; i < candidateList.length; i++) {
			if (candidateList[winnerIndex].getVote() == candidateList[i].getVote()) {
				tieFlag++;
			}
		}
		if (tieFlag == 1) {
			System.out.println("");
			System.out.println("The winner is " + candidateList[winnerIndex].getName() + " with "
					+ candidateList[winnerIndex].getVote() + " votes!");
		} else {
			System.out.println("");
			System.out.println("The election is a tie between the following candidates: ");
			for (int i = 0; i < candidateList.length; i++) {
				if (candidateList[winnerIndex].getVote() == candidateList[i].getVote()) {
					System.out.println(candidateList[i].getName() + " (" + candidateList[i].getVote() + " votes)");
				}
			}
		}
		input.close();
	}

}
