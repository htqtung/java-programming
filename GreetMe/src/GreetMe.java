import java.util.Scanner;

public class GreetMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();
		System.out.println("Hello, " + firstName + "!");
	}
}
