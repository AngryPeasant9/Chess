package ChessGame;

public class Knight extends Piece {
	
	public Knight(int row, int column, boolean isBlack) {
		super(row, column, isBlack);
		this.pieceSymbol = "Kn";
	}
	
	//HHHHHAAAAAAYYYYY THIS IS NEXT!!!!!!
	//Might not be needed...
	public boolean isMoveLegal(int row, int column) {
		return false;
	}
	
	//This returns whether it's a legal knight jump or not.
	public boolean isValidKnightJump(int row, int column) {
		int jumpRowDifference = Math.abs(this.row - row);
		int jumpColumnDifference = Math.abs(this.column - column);
		
		if ((jumpRowDifference == 1 && jumpColumnDifference == 2) || (jumpRowDifference == 2 && jumpColumnDifference == 1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}