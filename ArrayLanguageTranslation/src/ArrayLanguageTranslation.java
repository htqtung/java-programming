import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] englishArray = { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };
		String[] finnishArray = { "lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja" };
		System.out.print("Enter an english word: ");
		String text = input.nextLine();
		int finWordIndex = -1;
		for (int i = 0; i < englishArray.length; i++) {
			if (text.equals(englishArray[i])) {
				finWordIndex = i;
			}
		}
		if (finWordIndex == -1) {
			System.out.println("Unknown word");
		} else {
			System.out.println(finnishArray[finWordIndex]);
		}
		input.close();
	}

}
