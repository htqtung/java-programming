import java.util.Scanner;

public class IntegerDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter dividend: ");
		int dividend = Integer.parseInt(input.nextLine());
		System.out.print("Enter divisor: ");
		int divisor = Integer.parseInt(input.nextLine());
		System.out.println(dividend + " / " + divisor + " = " + (dividend / divisor) + ", the remainder is "
				+ (dividend % divisor));

		input.close();
	}

}