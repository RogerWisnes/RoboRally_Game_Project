package inf112.skeleton.app;

import java.util.Random;

import inf112.skeleton.app.TileTypes.Tile;
import inf112.skeleton.app.TileTypes.*;

enum Direction {
    UP, DOWN, LEFT, RIGHT
}


public class Board {
    private final int BOARDSIZE_X, BOARDSIZE_Y;
    private Tile[][] boardList = new Tile[BOARDSIZE_X][BOARDSIZE_Y];


    public Board(int boardSize) {
        this.BOARDSIZE_X = boardSize;
        this.BOARDSIZE_Y = boardSize;
        boardList = new Tile[BOARDSIZE_X][BOARDSIZE_Y];
        populateTileBoard();
    }

    public Tile getTile(int x, int y) {
        return boardList[x][y];
    }

    public int getBOARDSIZE_X() {
        return BOARDSIZE_X;
    }

    public int getBOARDSIZE_Y() {
        return BOARDSIZE_Y;
    }

    //TODO create standard Tile board
    private void populateTileBoard() {
        Random r = new Random(3);
        for (int i = 0; i < BOARDSIZE_X; i++) {
            for (int j = 0; j < BOARDSIZE_Y; j++) {
                if (r.nextInt() == 0) {
                    boardList[i][j] = new Conveyor(Direction.UP);
                } else if (r.nextInt() == 1) {
                    boardList[i][j] = new Conveyor(Direction.DOWN);
                } else if (r.nextInt() == 2) {
                    boardList[i][j] = new Conveyor(Direction.LEFT);
                } else if (r.nextInt() == 3) {
                    boardList[i][j] = new Conveyor(Direction.RIGHT);
                }
            }
        }
    }


    //board based on input
    private void populateBoard(String input) {

    }


}
