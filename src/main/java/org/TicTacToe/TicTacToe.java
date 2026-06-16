package org.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Current Player: " + currentPlayer.getMarker());
            board.print();

            System.out.print("row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("column (0-2): ");
            int col = scanner.nextInt();

            if (board.isCellEmpty(row, col)) {
                board.place(row, col, currentPlayer.getMarker());
            } else {
                System.out.println("Cell already taken! Try again.");
                continue;
            }

            if (hasWinner()) {
                board.print();
                System.out.println("Player " + currentPlayer.getMarker() + " wins!");
                break;
            }

            if (board.isFull()) {
                board.print();
                System.out.println("It's a draw!");
                break;
            }

            switchCurrentPlayer();
        }
        scanner.close();
    }

    private void switchCurrentPlayer() {
        if (currentPlayer == player1) currentPlayer = player2;
        else currentPlayer = player1;
    }

    public boolean hasWinner() {
        char[][] c = board.getCells();
        char m = currentPlayer.getMarker();
        for (int i = 0; i < 3; i++) {
            if (c[i][0] == m && c[i][1] == m && c[i][2] == m) return true;
            if (c[0][i] == m && c[1][i] == m && c[2][i] == m) return true;
        }
        if (c[0][0] == m && c[1][1] == m && c[2][2] == m) return true;
        if (c[0][2] == m && c[1][1] == m && c[2][0] == m) return true;
        return false;
    }
}