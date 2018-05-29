package ChessGame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KnightTest {

	@Test
	void testIsValidKnightJump() {
		Knight testKnight = new Knight(2, 4, false);
		assertEquals(true, testKnight.isValidKnightJump(4, 3));
		assertEquals(true, testKnight.isValidKnightJump(4, 5));
		assertEquals(true, testKnight.isValidKnightJump(3, 6));
		assertEquals(true, testKnight.isValidKnightJump(1, 6));
		assertEquals(true, testKnight.isValidKnightJump(0, 3));
		assertEquals(true, testKnight.isValidKnightJump(0, 5));
		assertEquals(true, testKnight.isValidKnightJump(1, 2));
		assertEquals(true, testKnight.isValidKnightJump(3, 2));
		
		assertEquals(false, testKnight.isValidKnightJump(4, 2));
		assertEquals(false, testKnight.isValidKnightJump(3, 7));
		assertEquals(false, testKnight.isValidKnightJump(0, 4));
		assertEquals(false, testKnight.isValidKnightJump(4, 6));
	}

}
