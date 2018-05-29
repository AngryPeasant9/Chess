package ChessGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueenTest {

	@Test
	void testIsValidMove() {
		Queen testQueen = new Queen(4, 4, false);
		//True situations
		assertEquals(true, testQueen.isValidMove(4, 1));
		assertEquals(true, testQueen.isValidMove(4, 7));
		assertEquals(true, testQueen.isValidMove(0, 4));
		assertEquals(true, testQueen.isValidMove(7, 4));
		assertEquals(true, testQueen.isValidMove(7, 1));
		assertEquals(true, testQueen.isValidMove(1, 7));
		assertEquals(true, testQueen.isValidMove(7, 7));
		assertEquals(true, testQueen.isValidMove(0, 0));
		assertEquals(true, testQueen.isValidMove(2, 2));
		
		assertEquals(false, testQueen.isValidMove(7, 3));
	}

}
