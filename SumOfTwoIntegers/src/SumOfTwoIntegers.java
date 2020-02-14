import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a = Integer.parseInt(input.nextLine());
		System.out.print("Enter second integer: ");
		int b = Integer.parseInt(input.nextLine());
		System.out.println(a + " + " + b + " = " + (a + b));

		input.close();
	}

}
