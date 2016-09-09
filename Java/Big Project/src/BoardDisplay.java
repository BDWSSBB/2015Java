
public class BoardDisplay {
	private String symbols [] = new String[9];
	public BoardDisplay(String selection[]){
		for(int i = 0; i < 9; i++){
			this.symbols[i] = selection[i];
		}
	}
	public String toString(){
		return symbols[0] + "|" + symbols[1] + "|" + symbols[2] + "\n" +
		"-+-+-\n" +
		symbols[3] + "|" + symbols[4] + "|" + symbols[5] + "\n" +
		"-+-+-\n" +
		symbols[6] + "|" + symbols[7] + "|" + symbols[8];
	}
}
