package ChessGame;

public class Rook extends Piece{
	
	public Rook(int row, int column, boolean isBlack) {
		super(row, column, isBlack);
		this.pieceSymbol = "R";
	}
	
	public boolean isValidMove(int row, int column) {
		if(this.row - row == 0 || this.column - column == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}