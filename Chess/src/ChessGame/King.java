package ChessGame;

public class King extends Piece {
	
	public King(int row, int column, boolean isBlack) {
		super(row, column, isBlack);
		this.pieceSymbol = "K";
	}
	
	public boolean isValidMove(int row, int column) {
		if(Math.abs(this.row - row) <= 1 && Math.abs(this.column - column) <= 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
