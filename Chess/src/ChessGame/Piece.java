package ChessGame;

public class Piece{
	//Whether or not the piece is black or white 
	public boolean isBlack;
	
	//Where the piece currently is.
	public int row;
	public int column;
	protected String pieceSymbol;
	
	
	public Piece(int row, int column, boolean isBlack) {
		this.row = row;
		this.column = column;
		this.isBlack = isBlack;
		this.pieceSymbol = "  ";
	}
	
	public boolean moveToOrTake(int row, int column) {
		if (isMoveLegal(row, column)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isMoveLegal(int row, int column) {
		return true;
	}
	
	//returns B or W for empty squares
	public String toString() {
		if (this.pieceSymbol == "  ") {
			return "  ";
		}
		else {
			if (isBlack){
				return "B" + this.pieceSymbol;
			}
			else {
				return "W" + this.pieceSymbol;
			}
		}
	}
	
	
}