
public class WinChecker {
	public void checkIfWinner(String selection[], boolean someoneWon, int playerTurn){
		if(selection[0] == selection[3] && selection[3] == selection[6]){
			someoneWon = true;
		}
		else if(selection[1] == selection[4] && selection[4] == selection[7]){
			someoneWon = true;
		}
		else if(selection[2] == selection[5] && selection[5] == selection[8]){
			someoneWon = true;
		}
		else if(selection[0] == selection[1] && selection[1] == selection[2]){
			someoneWon = true;
		}
		else if(selection[3] == selection[4] && selection[4] == selection[5]){
			someoneWon = true;
		}
		else if(selection[6] == selection[7] && selection[7] == selection[8]){
			someoneWon = true;
		}
		else if(selection[0] == selection[4] && selection[4] == selection[8]){
			someoneWon = true;
		}
		else if(selection[2] == selection[4] && selection[4] == selection[6]){
			someoneWon = true;
		}
	}
}
