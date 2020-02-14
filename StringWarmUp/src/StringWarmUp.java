import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = input.nextLine();
		System.out.println(text.length() + " characters");
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		input.close();
	}

}
