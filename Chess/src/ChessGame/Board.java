package ChessGame;
import ChessGame.Piece;

public class Board{
	
	private Piece[][] pieceLocations;
	
	public Board() {
		pieceLocations = new Piece[8][8];
	}
	
	public String seeBoardPiece(int row, int column) {
		return pieceLocations[row][column].toString();
	}
	
	//Resets the game board
	public void resetBoard() {
		wipeBoard();
		placeAllPawns();
		placeAllRooks();
		placeAllKnights();
		placeAllBishops();
		placeAllQueens();
		placeAllKings();
	}
	
	private void placeAllKings() {
		placeKing(0, 4, false);
		placeKing(7, 4, true);
	}

	private void placeKing(int row, int column, boolean isBlack) {
		pieceLocations[row][column] = new King(row, column, isBlack);
	}

	private void placeAllQueens() {
		placeQueen(0, 3, false);
		placeQueen(7, 3, true);
	}

	private void placeQueen(int row, int column, boolean isBlack) {
		pieceLocations[row][column] = new Queen(row, column, isBlack);
	}

	//placing Bishops
	private void placeAllBishops() {
		//White bishops
		placeBishop(0, 2, false);
		placeBishop(0, 5, false);
		
		//Black Bishops
		placeBishop(7, 2, true);
		placeBishop(7, 5, true);
	}
	
	//place a bishop
	private void placeBishop(int row, int column, boolean isBlack) {
		pieceLocations[row][column] = new Bishop(row, column, isBlack);
	}
	
	//place a knight
	private void placeAllKnights() {
		placeKnight(0, 1, false);
		placeKnight(0, 6, false);
		placeKnight(7, 1, true);
		placeKnight(7, 6, true);
	}
	
	private void placeKnight(int row, int column, boolean isBlack) {
		pieceLocations[row][column] = new Knight(row, column, isBlack);
	}
	
	private void placeAllRooks() {
		placeRook(0, 0, false);
		placeRook(0, 7, false);
		placeRook(7, 0, true);
		placeRook(7, 7, true);
	}
	
	private void placeRook(int row, int column, boolean isBlack) {
		pieceLocations[row][column] = new Rook(row, column, isBlack);
	}

	private void placeAllPawns() {
		int row = 1;
		for(int column = 0; column < pieceLocations[row].length; column++) {
				placePawn(row, column, false);
		} 
		row = 6;
		for(int column = 0; column < pieceLocations[row].length; column++) {
				placePawn(row, column, true);
		}
	}
	
	private void placePawn(int row, int column, boolean isBlack) {
		pieceLocations[row][column] = new Pawn(row, column, isBlack);
	}

	//Clears off all the pieces off the board.
	public void wipeBoard() {
		pieceLocations = new Piece[8][8];
		for(int row = 0; row < pieceLocations.length; row++) {
			for(int column = 0; column < pieceLocations[row].length; column++) {
				pieceLocations[row][column] = new Piece(row, column, false);
			}
		}
	}
	
	//sets Pawns
	public void setPawns() {
		//Sets the white pawns
		for(int i = 0; i < (pieceLocations[1].length); i++) {
			pieceLocations[1][i] = new Pawn(1, i, false);
		}
		//Sets the black Pawns
		for(int i = 0; i < (pieceLocations[1].length); i++) {
			pieceLocations[6][i] = new Pawn(6, i, true);
		}
	}
	
	//Checks to see if a suggested square is on the board
	public boolean isOnBoard(int row, int column) {
		if (row > 7 || row < 0 || column > 7 || column < 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void printBoard()
	{
		System.out.println("________________________");
		for(int i = 0; i < 8; i++) {
			System.out.println("|" + pieceLocations[i][0] + "|" + pieceLocations[i][1] + "|" + pieceLocations[i][2] + "|" + pieceLocations[i][3] + "|" + pieceLocations[i][4] + "|" + pieceLocations[i][5] + "|" + pieceLocations[i][6] + "|" + pieceLocations[i][7] + "|" );
			System.out.println("________________________");
		}
		
	}
	
}