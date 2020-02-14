import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String txtInput = input.nextLine();
		txtInput = removeExtraSpace(txtInput);
		System.out.println('"' + txtInput + '"');
		input.close();
	}

	private static String removeExtraSpace(String input) {
		String output;
		output = input.trim();
		output = output.replaceAll("( ){1,}", " ");
		return output;
	}
}
