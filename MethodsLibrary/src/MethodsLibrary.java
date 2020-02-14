
public class MethodsLibrary {
	public static int Factorial(int number) {
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
