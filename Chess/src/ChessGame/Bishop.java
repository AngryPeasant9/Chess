package ChessGame;

public class Bishop extends Piece{
	
	public Bishop(int row, int column, boolean isBlack) {
		super(row, column, isBlack);
		this.pieceSymbol = "B";
	}
	
	//Checks if the the given coordinates are diagonal to the bishop.
	public boolean isValidMove(int row, int column) {
		int rowDifference = Math.abs(this.row - row);
		if(rowDifference == 0 && column == this.column) {
			return false;
		}
		else if(column == this.column + rowDifference || column == this.column - rowDifference) {
			return true;
		}
		else {
			return false;
		}
	}
	
}