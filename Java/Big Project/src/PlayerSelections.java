
public class PlayerSelections {
	public String whoseTurn(int playerTurn){
		return "It is player " + playerTurn + "'s turn. Select a numbered square.";
	}
	public static void turnPlayed(int input, int playerTurn, String selection[]){
		if(input > 0 && input < 10){
			if(selection[input-1] != "X" && selection[input-1] != "O"){
				if(playerTurn == 1){
					selection[input - 1] = "X";
					playerTurn = 2;
				}
				else{
					selection[input - 1] = "O";
					playerTurn = 1;
				}
			}
		}
		else{
			System.out.println("Invalid selection!");
		}
	}
}
