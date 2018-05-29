package ChessGame;

public class Pawn extends Piece {
	
	public Pawn(int row, int column, boolean isBlack) {
		super(row, column, isBlack);
		this.pieceSymbol = "P";
	}
	
	//This one could be a toughy. It IS a toughy!!!!
	public boolean isPawnMove(int row, int column, boolean isPieceThere, boolean isEnemyPiece) {
		boolean goodDirection = false;
		//Rules for a potential 2 spot move on first row.
		if((this.isBlack && this.row - row == 2) || (!this.isBlack && this.row - row == -2) && !isPieceThere && (this.row == 1 || this.row == 6) && this.column - column == 0) {
			return true;
		}
		//Rules for a normal move forward
		else if ((this.isBlack && this.row - row > 0 || !this.isBlack && this.row - row < 0) && Math.abs(this.row - row) == 1 && !isPieceThere && this.column - column == 0) {
			return true;
		}
		//Rules for taking an enemy piece.
		else if(Math.abs(this.column - column) == 1 &&
				(this.isBlack && this.row - row == 1 || !this.isBlack && this.row - row == -1) &&
				isPieceThere &&
				isEnemyPiece) {
			return true;
		}
		else {
			return false;
		}
	}
}
