import java.util.Scanner;

public class Candidate {
	private String name;
	private int vote;

	public Candidate(String name, int vote) {
		this.name = name;
		this.vote = vote;
	}

	public Candidate() {
		this.name = "";
		this.vote = 0;
	}

	public String getName() {
		return name;
	}

	public int getVote() {
		return vote;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(Scanner input) {
		this.name = input.nextLine();
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public void setVote(Scanner input) {
		this.vote = Integer.parseInt(input.nextLine());
	}
}
