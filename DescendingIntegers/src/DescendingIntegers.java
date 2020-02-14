import java.util.Scanner;

public class DescendingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = Integer.parseInt(input.nextLine());
		for (int i = a; i >= 1; i--) {
			System.out.print(i + " ");
		}

		input.close();
	}

}
