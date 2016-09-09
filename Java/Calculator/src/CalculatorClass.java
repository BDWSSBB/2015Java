import java.util.Scanner;

//String num = "" + [integer here]
public class CalculatorClass {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator");
		Scanner scan = new Scanner(System.in);
		double result = 0;
		String input = null;
		double doubleInput;
		String displayed = "        0";
		String operationInAction = "None";
		while (true){
			System.out.println(" _________ ");
			System.out.println("/" + displayed + "\\");
			System.out.println("+---------+");
			System.out.println("| 7 8 9 + |");
			System.out.println("| 4 5 6 - |");
			System.out.println("| 1 2 3 * |");
			System.out.println("| C 0 ^ / |");
			System.out.println("\\_________/");
			input = scan.next();
			if(input.equals("+")){
				operationInAction = "+";
				displayed = "        +";
			}
			else if(input.equals("-")){
				operationInAction = "-";
				displayed = "        -";
			}
			else if(input.equals("*")){
				operationInAction = "*";
				displayed = "        *";
			}
			else if(input.equals("/")){
				operationInAction = "/";
				displayed = "        /";
			}
			else if(input.equals("^")){
				operationInAction = "^";
				displayed = "        ^";
			}
			else if(input.equalsIgnoreCase("C") ){
				result = 0;
				displayed = "        0";
				operationInAction = "None";
			}
			else{
				doubleInput = Double.parseDouble(input);
				if(operationInAction == "+"){
					result = result + doubleInput;
				}
				else if(operationInAction == "-"){
					result = result - doubleInput;
				}
				else if(operationInAction == "*"){
					result = result * doubleInput;
				}
				else if(operationInAction == "/"){
					result = result / doubleInput;
				}
				else if(operationInAction == "^"){
					result = Math.pow(result, doubleInput);
				}
				else{
					result = doubleInput;
				}
				displayed = "";
				for(int i = 0; i < 9 - String.valueOf(result).length(); i++){
					displayed += " "; 
				}
				displayed += String.valueOf(result);
				if(displayed.length() > 9){
					if(result >= 1000000000){
						displayed = "    Error";
						result = 0;
					}
					else{
						String temp = "";
						for(int i = 0; i < 9; i++){
							temp += displayed.charAt(i);
						}
						displayed = temp;
					}
				}
				operationInAction = "None";
			}
		}
	}

}
