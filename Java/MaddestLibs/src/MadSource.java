import java.io.InputStream;
import java.util.Scanner;

public class MadSource {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		String[] pOS = new String[10];
		pOS[0] = "adverb";
		pOS[1] = "noun";
		pOS[2] = "adjective";
		pOS[3] = "noun";
		pOS[4] = "verb";
		pOS[5] = "day of the week";
		pOS[6] = "adverb";
		pOS[7] = "number";
		pOS[8] = "noun";
		pOS[9] = "verb";
		
		String [] input = new String[10];
		for(int i = 0; i < pOS.length; i++){
			System.out.println("Input an " + pOS[i] + ".");
			input[i] = scan.nextLine();
		}
		
		System.out.println("In a forest, butterflies fly " + input[0] + ". A known creature called the " + input[1] + " eats these butterflies.  Most of them are known to be " + input[2] + ", but a mutation created another species called a " + input[3]);
	}
}