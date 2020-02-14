
public class MethodsFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "! = " + Factorial(i));
		}
	}

	private static int Factorial(int number) {
		int factorial = 1;
		if (number == 0) {
			return 1;
		}
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
