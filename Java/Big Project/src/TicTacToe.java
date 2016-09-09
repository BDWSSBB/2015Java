import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		while (true) {
			String selection[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
			Scanner scan = new Scanner(System.in);
			int input;
			int playerTurn = 1;
			int gameTieChecker = 0;
			boolean someoneWon = false;
			while (true) {
				BoardDisplay symbolCopy = new BoardDisplay(selection);
				System.out.println(symbolCopy.toString());
				PlayerSelections playerSelections = new PlayerSelections();
				System.out.println(playerSelections.whoseTurn(playerTurn));
				input = scan.nextInt();
				PlayerSelections.turnPlayed(input, playerTurn, selection);
				WinChecker winChecker = new WinChecker();
				winChecker.checkIfWinner(selection, someoneWon, playerTurn);
				if(someoneWon == true){
					if(playerTurn == 2){
						System.out.println("Player 1 won!");
					}
					else{
						System.out.println("Player 2 won!");
					}
					break;
				}
				else if(gameTieChecker == 8){
					System.out.println("It's a tie!");
					break;
				}
				gameTieChecker++;
			}
		}
	}
	public MultipleVariables transferPrimitives(){
		return MultipleVariables(playerTurn, someoneWon);
	}
}


class MultipleVariables{
	int playerTurn;
	boolean someoneWon;
	
	public MultipleVariables(int playerTurn, boolean someoneWon){
		this.playerTurn = playerTurn;
		this.someoneWon = someoneWon;
	}
}