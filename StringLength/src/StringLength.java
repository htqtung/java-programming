import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String inputString = input.nextLine();
		String targetString = "";
		while (!inputString.equals("quit")) {
			System.out.print("Enter a string: ");
			targetString += inputString;
			inputString = input.nextLine();
		}
		System.out.println("The total length is " + targetString.length());

		input.close();
	}

}
