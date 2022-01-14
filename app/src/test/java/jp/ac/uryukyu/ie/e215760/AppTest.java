package jp.ac.uryukyu.ie.e215760;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void placeStoneTest(){
        int xSize = 5;
        int ySize = 5;
        Stone white = new White();
        Board testBoard = new Board(xSize,ySize);
        testBoard.createBoard();
        while(testBoard.gameEnd == false){
            white.placeStoneEx(testBoard, xSize, ySize);
            testBoard.check(white);
        }
        assertEquals(true, white.win);

        }
    
    @Test
    void winTestRight(){
        int xSize = 5;
        int ySize = 5;
        Stone white = new White();
        Board testBoard = new Board(xSize,ySize);
        testBoard.createBoard();
        testBoard.board[2][0] = 1;
        testBoard.board[2][1] = 1;
        testBoard.board[2][2] = 1;
        testBoard.board[2][3] = 1;
        testBoard.board[2][4] = 1;

        testBoard.check(white);
        assertEquals(true, white.win);

    }

    @Test
    void winTestDown(){
        int xSize = 5;
        int ySize = 5;
        Stone white = new White();
        Board testBoard = new Board(xSize,ySize);
        testBoard.createBoard();
        testBoard.board[0][2] = 1;
        testBoard.board[1][2] = 1;
        testBoard.board[2][2] = 1;
        testBoard.board[3][2] = 1;
        testBoard.board[4][2] = 1;

        testBoard.check(white);
        assertEquals(true, white.win);

    }

    @Test
    void winTestRightDown(){
        int xSize = 5;
        int ySize = 5;
        Stone white = new White();
        Board testBoard = new Board(xSize,ySize);
        testBoard.createBoard();
        testBoard.board[0][0] = 1;
        testBoard.board[1][1] = 1;
        testBoard.board[2][2] = 1;
        testBoard.board[3][3] = 1;
        testBoard.board[4][4] = 1;

        testBoard.check(white);
        assertEquals(true, white.win);

    }

    @Test
    void winTestLeftDown(){
        int xSize = 5;
        int ySize = 5;
        Stone white = new White();
        Board testBoard = new Board(xSize,ySize);
        testBoard.createBoard();
        testBoard.board[0][4] = 1;
        testBoard.board[1][3] = 1;
        testBoard.board[2][2] = 1;
        testBoard.board[3][1] = 1;
        testBoard.board[4][0] = 1;

        testBoard.check(white);
        assertEquals(true, white.win);

    }
        
}
    

