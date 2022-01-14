package jp.ac.uryukyu.ie.e215760;
public class Main {
    public static void main(String[] args){
        int xSize = 10;
        int ySize = 10;
        int maximumturn = xSize*ySize/2;

        Board board1 = new Board(xSize,ySize);
        Stone black = new Black();
        Stone white = new White();

        board1.createBoard();

        int i = 0;

        while( i < maximumturn){
            System.out.printf("\nTurn No. %d \n",i+1);
            i++;
            white.placeStoneEx(board1, xSize, ySize);
            board1.printBoard();
            board1.check(white);
            board1.isWin(white);
            black.placeStoneEx(board1, xSize, ySize);
            board1.printBoard();
            board1.check(black);
            board1.isWin(black);
        }
        System.out.println("Draw");

    }

    
}
