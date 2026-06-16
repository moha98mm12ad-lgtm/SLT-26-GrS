package org.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    void testBoardCellIsEmptyAtStart() {
        Board board = new Board();
        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    void testPlaceMarkerOnBoard() {
        Board board = new Board();
        board.place(1, 1, 'X');
        assertFalse(board.isCellEmpty(1, 1));
    }

    @Test
    void testBoardIsNotFullAtStart() {
        Board board = new Board();
        assertFalse(board.isFull());
    }

    @Test
    void testHasWinnerRow() {
        TicTacToe game = new TicTacToe();
        game.placeForTest(0, 0, 'X');
        game.placeForTest(0, 1, 'X');
        game.placeForTest(0, 2, 'X');
        assertTrue(game.hasWinner('X'));
    }

    @Test
    void testHasWinnerColumn() {
        TicTacToe game = new TicTacToe();
        game.placeForTest(0, 0, 'O');
        game.placeForTest(1, 0, 'O');
        game.placeForTest(2, 0, 'O');
        assertTrue(game.hasWinner('O'));
    }

    @Test
    void testHasWinnerDiagonal() {
        TicTacToe game = new TicTacToe();
        game.placeForTest(0, 0, 'X');
        game.placeForTest(1, 1, 'X');
        game.placeForTest(2, 2, 'X');
        assertTrue(game.hasWinner('X'));
    }

    @Test
    void testNoWinnerInitially() {
        TicTacToe game = new TicTacToe();
        assertFalse(game.hasWinner('X'));
    }
}