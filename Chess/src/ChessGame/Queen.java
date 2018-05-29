package ChessGame;

public class Queen extends Piece {
	
	public Queen(int row, int column, boolean isBlack) {
		super(row, column, isBlack);
		this.pieceSymbol = "Q";
	}

	public boolean isValidMove(int row, int column) {
		int rowDifference = Math.abs(this.row - row);
		if(rowDifference == 0 && column == this.column) {
			return false;
		}
		else if(column == this.column + rowDifference || column == this.column - rowDifference) {
			return true;
		}
		else if(this.row - row == 0 || this.column - column == 0) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
}
