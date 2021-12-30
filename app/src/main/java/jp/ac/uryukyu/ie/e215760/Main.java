package jp.ac.uryukyu.ie.e215760;
public class Main {
    public static void main(String[] args){
        int xSize = 2;
        int ySize = 7;

        Board board1 = new Board(xSize,ySize);
        Stone black = new Black();
        Stone white = new White();

        board1.createBoard();

        int i = 0;
        while( white.win && black.win){
            System.out.printf("\nTurn No. %d ",i+1);
            System.out.println();
            i++;
            white.placeStoneEx(board1, xSize, ySize);
            black.placeStoneEx(board1, xSize, ySize);
            board1.printBoard();
            if (i == 7){
                white.win = false;
                System.out.println("white Win?");
            }
        }
        System.out.println("END");
    }

    
    
}
