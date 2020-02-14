import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		List<String> stringList = new ArrayList<String>();
		System.out.print("Enter first string (Enter to ends): ");
		String userInput = input.nextLine();
		if (userInput.isEmpty()) {
			System.out.println("No string was entered");
		} else {
			while (!userInput.isEmpty()) {
				stringList.add(new String(userInput));
				System.out.print("Enter next string (Enter to ends): ");
				userInput = input.nextLine();
			}
			System.out.println("The number of strings is " + stringList.size());
		}

		input.close();
	}
}
