package ChessGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RookTest {

	@Test
	void testIsValidMove() {
		Rook testRook = new Rook(4, 4, false);
		//True situations
		assertEquals(true, testRook.isValidMove(4, 1));
		assertEquals(true, testRook.isValidMove(4, 7));
		assertEquals(true, testRook.isValidMove(0, 4));
		assertEquals(true, testRook.isValidMove(7, 4));
				
		assertEquals(false, testRook.isValidMove(7, 3));
	}

}
