import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = Integer.parseInt(input.nextLine());
		System.out.println(number + "! = " + MethodsLibrary.Factorial(number));
		input.close();
	}

}
