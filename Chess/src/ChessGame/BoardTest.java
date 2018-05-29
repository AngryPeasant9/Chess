package ChessGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void testResetBoard() {
		Board chessBoard = new Board();
		
		chessBoard.resetBoard();
		
		//Checking the white bishops
		assertEquals("WB", chessBoard.seeBoardPiece(0, 2));
		assertEquals("WB", chessBoard.seeBoardPiece(0, 5));
		
		//Checking the black bishops
		assertEquals("BB", chessBoard.seeBoardPiece(7, 2));
		assertEquals("BB", chessBoard.seeBoardPiece(7, 5));
		
		//Checking the White Pawns
		assertEquals("WP", chessBoard.seeBoardPiece(1, 0));
		assertEquals("WP", chessBoard.seeBoardPiece(1, 1));
		assertEquals("WP", chessBoard.seeBoardPiece(1, 2));
		assertEquals("WP", chessBoard.seeBoardPiece(1, 3));
		assertEquals("WP", chessBoard.seeBoardPiece(1, 4));
		assertEquals("WP", chessBoard.seeBoardPiece(1, 5));
		assertEquals("WP", chessBoard.seeBoardPiece(1, 6));
		assertEquals("WP", chessBoard.seeBoardPiece(1, 7));
		
		//Checking the Black Pawns
		assertEquals("BP", chessBoard.seeBoardPiece(6, 0));
		assertEquals("BP", chessBoard.seeBoardPiece(6, 1));
		assertEquals("BP", chessBoard.seeBoardPiece(6, 2));
		assertEquals("BP", chessBoard.seeBoardPiece(6, 3));
		assertEquals("BP", chessBoard.seeBoardPiece(6, 4));
		assertEquals("BP", chessBoard.seeBoardPiece(6, 5));
		assertEquals("BP", chessBoard.seeBoardPiece(6, 6));
		assertEquals("BP", chessBoard.seeBoardPiece(6, 7));
		
		//Checking the rooks
		assertEquals("WR", chessBoard.seeBoardPiece(0, 0));
		assertEquals("WR", chessBoard.seeBoardPiece(0, 7));
		assertEquals("BR", chessBoard.seeBoardPiece(7, 0));
		assertEquals("BR", chessBoard.seeBoardPiece(7, 7));
		
		//Checking the Knights
		assertEquals("WKn", chessBoard.seeBoardPiece(0, 1));
		assertEquals("WKn", chessBoard.seeBoardPiece(0, 6));
		assertEquals("BKn", chessBoard.seeBoardPiece(7, 1));
		assertEquals("BKn", chessBoard.seeBoardPiece(7, 6));
		
		//Checking Queens
		assertEquals("WQ", chessBoard.seeBoardPiece(0, 3));
		assertEquals("BQ", chessBoard.seeBoardPiece(7, 3));
		
		//Checking Kings
		assertEquals("WK", chessBoard.seeBoardPiece(0, 4));
		assertEquals("BK", chessBoard.seeBoardPiece(7, 4));
	}
	
	@Test
	void testIsOnBoard() {
		Board chessBoard = new Board();
		
		//Checking all spots on board in the 8x8 are true
		for (int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				assertEquals(true, chessBoard.isOnBoard(i, j), "Position i: " + i + " Position j: " + j);
			}
		}
		
		//few false conditions
		assertEquals(false, chessBoard.isOnBoard(-1, 5));
		assertEquals(false, chessBoard.isOnBoard(5, -1));
		assertEquals(false, chessBoard.isOnBoard(8, 1));
		assertEquals(false, chessBoard.isOnBoard(1, 8));
	}
	
	void testPrintBoard() {
		Board chessBoard = new Board();
		chessBoard.resetBoard();
		chessBoard.printBoard();
	}
}
