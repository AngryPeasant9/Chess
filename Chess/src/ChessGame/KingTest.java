package ChessGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KingTest {

	@Test
	void testIsValidMove() {
		King testKing = new King(2, 4, false);
		//Testing True scenarios
		assertEquals(true, testKing.isValidMove(3, 3));
		assertEquals(true, testKing.isValidMove(3, 4));
		assertEquals(true, testKing.isValidMove(3, 5));
		assertEquals(true, testKing.isValidMove(2, 3));
		assertEquals(true, testKing.isValidMove(2, 5));
		assertEquals(true, testKing.isValidMove(1, 3));
		assertEquals(true, testKing.isValidMove(1, 4));
		assertEquals(true, testKing.isValidMove(1, 5));
		
		
		assertEquals(false, testKing.isValidMove(4, 2));
		assertEquals(false, testKing.isValidMove(3, 7));
		assertEquals(false, testKing.isValidMove(0, 4));
		assertEquals(false, testKing.isValidMove(4, 6));
		assertEquals(false, testKing.isValidMove(5, 6));
		assertEquals(false, testKing.isValidMove(6, 6));
		assertEquals(false, testKing.isValidMove(7, 6));
		assertEquals(false, testKing.isValidMove(5, 6));
		assertEquals(false, testKing.isValidMove(2, 2));
		assertEquals(false, testKing.isValidMove(2, 1));
		assertEquals(false, testKing.isValidMove(4, 6));
		
	}

}
