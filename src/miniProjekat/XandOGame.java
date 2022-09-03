package miniProjekat;

import java.util.ArrayList;

public class XandOGame extends Player {

	private ArrayList<String> table =new ArrayList<String>();
	private String nextPlayer;
	private Player playerX;
	private Player playerO;
	
	
	public XandOGame(String punoIme) {
		super(punoIme);
		
	}
	public XandOGame () {
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
	}
	public XandOGame (Player playerX, Player playerO) {
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
		this.playerX=playerX;
		this.playerO=playerO;
	}
	
	public String getNextPlayer() {
		return nextPlayer;
	}
	public void setNextPlayer(String nextPlayer) {
		this.nextPlayer = nextPlayer;
	}
	public Player getPlayerX() {
		return playerX;
	}
	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}
	public Player getPlayerO() {
		return playerO;
	}
	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}
	public ArrayList<String> getTable() {
		return table;
	}
	public void setTable(ArrayList<String> table) {
		this.table = table;
	}
	
//	x | x | 0 | - 0,1,2
//	0 | x | 0 | -3,4,5
//	x | 0 | x | -6,7,8

	public void printTable() {
		for (int i = 0; i < table.size(); i++) {
			System.out.print(table.get(i)+"|");
			if (i==2) {
				System.out.println();
			}
			if (i==5) {
				System.out.println();
			}
		}
	}
	
	public void startGame() {
		for (int i = 0; i < table.size(); i++) {
			table.set(i, " ");
		}
		nextPlayer="x";
	}
	
//	public String isGameOver() {
//		for (int i = 0; i < table.size(); i++) {
//		if (table.get(i).equals("x") || table.get(i).equals("o")) {
//		}
//		return System.out.println("Game is over!");
//	}
	
	public boolean isGameOver() {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).equals(" ")) {
				return false;
			}
		}return true;
	}
	
	public boolean isFieldFree (int pozicija) {
		for (int i = 0; i < table.size(); i++) {
			if (pozicija==i && table.get(i).equals("x")||table.get(i).equals("o")) {
				return false;
			}
		}return true;
	}
	
	public void playNext() {
		
		if (nextPlayer.equals("x")) {
				nextPlayer="o";
		} else {
			nextPlayer="x";
		}
}
	public void makeAMove(int pozicija) {
		if (isFieldFree(pozicija)==true) {
			table.set(pozicija, nextPlayer);
		}
	}
	public boolean isWinnerX() {
		if (table.get(0).equals("x")&&table.get(1).equals("x")&&table.get(2).equals("x")
				||table.get(3).equals("x")&&table.get(4).equals("x")&&table.get(5).equals("x")
				||table.get(6).equals("x")&&table.get(7).equals("x")&&table.get(8).equals("x")) {
			return true;
		} else if(table.get(0).equals("x")&&table.get(3).equals("x")&&table.get(6).equals("x")
				||table.get(1).equals("x")&&table.get(4).equals("x")&&table.get(7).equals("x")
				||table.get(2).equals("x")&&table.get(5).equals("x")&&table.get(8).equals("x")) {
			return true;
		} else if(table.get(0).equals("x")&&table.get(4).equals("x")&&table.get(8).equals("x")
				||table.get(2).equals("x")&&table.get(4).equals("x")&&table.get(6).equals("x")) {
			return true;
		} return false;
	}
	
	public boolean isWinnerO() {
		if (table.get(0).equals("o")&&table.get(1).equals("o")&&table.get(2).equals("o")
				||table.get(3).equals("o")&&table.get(4).equals("o")&&table.get(5).equals("o")
				||table.get(6).equals("o")&&table.get(7).equals("o")&&table.get(8).equals("o")) {
			return true;
		} else if(table.get(0).equals("o")&&table.get(3).equals("o")&&table.get(6).equals("o")
				||table.get(1).equals("o")&&table.get(4).equals("o")&&table.get(7).equals("o")
				||table.get(2).equals("o")&&table.get(5).equals("o")&&table.get(8).equals("o")) {
			return true;
		} else if(table.get(0).equals("o")&&table.get(4).equals("o")&&table.get(8).equals("o")
				||table.get(2).equals("o")&&table.get(4).equals("o")&&table.get(6).equals("o")) {
			return true;
		} return false;
	}
	
	public boolean isValidMove(int pozicija) {
		if (pozicija >= 0 && pozicija <= 8) {
			return true;
		} else {
			return false;
		}
	}
	
	public int gameScore() {
		if (isWinnerX()==true) {
			return 1;
		} else if (isWinnerO()==true) {
			return 2;
		} else {
			return 0;
		}
	}
		
}

