import java.util.Scanner;

public class ArrayLanguageTranslationOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		WordPair[] dictionary = { 
				new WordPair("bird", "koivu"), 
				new WordPair("bus", "bussi"),
				new WordPair("car", "auto"),
				new WordPair("cat", "kissa"),
				new WordPair("dog", "koira")
		};
		System.out.print("Enter an english word: ");
		String text = input.nextLine();
		int index = -1;
		for (int i = 0; i < dictionary.length; i++) {
			if (text.equals(dictionary[i].getEnglishWord())) {
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("Unknown word");
		} else {
			System.out.println(dictionary[index].getFinnishWord());
		}
		input.close();
	}

}
