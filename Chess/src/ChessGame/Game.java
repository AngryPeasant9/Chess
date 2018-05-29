package ChessGame;

import java.util.ArrayList;

public class Game{
	
	private boolean blackTurn;
	private boolean gameOver;
	private String victor;
	
	public Game() {
		this.blackTurn = false;
		this.gameOver = false;
		this.victor = "No victor yet!";
	
		
	}
	
	public void Chess() {
		
		Board currentBoard = new Board();
		currentBoard.resetBoard();
		
		ArrayList<Piece> allWhitePieces = new ArrayList();
		ArrayList<Piece> allBlackPieces = new ArrayList();
		
		for(int i = 0; i < 8; i++) {
			allWhitePieces.add(new Pawn(1, i, false));
		}
		
		for(int i = 0; i < 8; i++) {
			allBlackPieces.add(new Pawn(1, i, true));
		}
		
		
		
		while(!gameOver) {
			if (checkMated()) {
				this.gameOver = true;
				if(this.blackTurn == true) {
					this.victor = "White Wins!";
				}
				else {
					this.victor = "Black Wins!";
				}
			}
			else if (NoMovesAvailable()) {
				this.gameOver = true;
				this.victor = "Draw!";
			}
			else {
				takeTurn();
			}
		}
	}
	
	public boolean checkMated() {
		return false;
	}
	
	public boolean NoMovesAvailable() {
		return false;
	}
	
	public void takeTurn() {
		
	}
	
	public boolean isKingChecked(Piece King) {
		return false;
	}
	
	public 
	
	
	public static void main(String[] args) {
		Board testBoard = new Board();
		testBoard.resetBoard();
		testBoard.printBoard();
	}
}