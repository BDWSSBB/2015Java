import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			int input;
			int input2;
			System.out.println("Enter the first numerator.");
			input = scan.nextInt();
			System.out.println("Enter the first denominator.");
			input2 = scan.nextInt();
			Fraction number1 = new Fraction(input, input2);
			System.out.println("Enter the second numerator.");
			input = scan.nextInt();
			System.out.println("Enter the second denominator.");
			input2 = scan.nextInt();
			Fraction number2 = new Fraction(input, input2);
			System.out.println(number1.toString());
			System.out.println(number2.toString());
		}
	}
}
