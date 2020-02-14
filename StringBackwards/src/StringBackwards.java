import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String a = input.nextLine();
		String reversedA = reverse(a);
		System.out.println(reversedA);
		input.close();
	}

	private static String reverse(String input) {
		String result = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			result += input.charAt(i);
		}
		return result;
	}
}
