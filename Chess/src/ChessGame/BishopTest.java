package ChessGame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BishopTest {

	void setup() {
		
	}
	
	@Test
	void testIsValidMove() {
		Bishop testBishop = new Bishop(4, 4, true);
		assertEquals(true, testBishop.isValidMove(3, 3));
		assertEquals(false, testBishop.isValidMove(4, 4));
		assertEquals(true, testBishop.isValidMove(3, 5));
		assertEquals(true, testBishop.isValidMove(2, 6));
		assertEquals(true, testBishop.isValidMove(1, 7));
		assertEquals(true, testBishop.isValidMove(0, 8));
		assertEquals(true, testBishop.isValidMove(0, 0));
		assertEquals(true, testBishop.isValidMove(1, 1));
		assertEquals(true, testBishop.isValidMove(2, 2));
		assertEquals(true, testBishop.isValidMove(6, 6));
		assertEquals(true, testBishop.isValidMove(7, 1));
		assertEquals(false, testBishop.isValidMove(3, 1));
		assertEquals(false, testBishop.isValidMove(4, 5));
		assertEquals(false, testBishop.isValidMove(6, 3));
		
		Bishop testBishop2 = new Bishop(2, 0, true);
		assertEquals(true, testBishop2.isValidMove(4, 2));
		assertEquals(false, testBishop2.isValidMove(3, 0));		
		assertEquals(false, testBishop2.isValidMove(5, 2));
	}
/*
	@Test
	void testBishop() {
		fail("Not yet implemented");
	}

	@Test
	void testIsDiagonal() {
		fail("Not yet implemented");
	}

*/
}
