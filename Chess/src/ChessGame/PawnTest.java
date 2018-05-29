package ChessGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PawnTest {

	@Test
	void testIsPawnMove() {
		Pawn testPawn = new Pawn(4, 4, false);
		//Moves for a regular middle of the board pawn move without a piece
		assertEquals(false, testPawn.isPawnMove(3, 3, false, false));
		assertEquals(false, testPawn.isPawnMove(5, 5, false, false));
		assertEquals(false, testPawn.isPawnMove(4, 3, false, false));
		assertEquals(false, testPawn.isPawnMove(3, 3, false, false));
		assertEquals(false, testPawn.isPawnMove(5, 3, false, false));
		assertEquals(false, testPawn.isPawnMove(6, 6, false, false));
		assertEquals(false, testPawn.isPawnMove(7, 7, false, false));
		assertEquals(true, testPawn.isPawnMove(5, 4, false, false));
		
		//Moves if a piece is there and enemy
		assertEquals(true, testPawn.isPawnMove(5, 3, true, true));
		assertEquals(true, testPawn.isPawnMove(5, 5, true, true));
		assertEquals(false, testPawn.isPawnMove(4, 3, true, true));
		assertEquals(false, testPawn.isPawnMove(4, 5, true, true));
		assertEquals(false, testPawn.isPawnMove(5, 4, true, true));
		assertEquals(false, testPawn.isPawnMove(3, 4, true, true));
		assertEquals(false, testPawn.isPawnMove(5, 4, true, true));
		
		//Piece there and friend
		assertEquals(false, testPawn.isPawnMove(5, 3, true, false));
		assertEquals(false, testPawn.isPawnMove(5, 5, true, false));
		assertEquals(false, testPawn.isPawnMove(4, 3, true, false));
		assertEquals(false, testPawn.isPawnMove(4, 5, true, false));
		assertEquals(false, testPawn.isPawnMove(5, 4, true, false));
		assertEquals(false, testPawn.isPawnMove(3, 4, true, false));
		assertEquals(false, testPawn.isPawnMove(5, 4, true, false));
		
		
		//Checking first moves
		testPawn = new Pawn(6, 4, false);
		assertEquals(false, testPawn.isPawnMove(5, 4, false, false));
		assertEquals(false, testPawn.isPawnMove(4, 4, false, false));
		testPawn = new Pawn(1, 4, false);
		assertEquals(true, testPawn.isPawnMove(2, 4, false, false));
		assertEquals(true, testPawn.isPawnMove(3, 4, false, false));
	}

}
