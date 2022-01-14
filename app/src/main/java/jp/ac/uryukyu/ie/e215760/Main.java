package jp.ac.uryukyu.ie.e215760;
public class Main {
    public static void main(String[] args){
        int xSize = 8;
        int ySize = 8;
        int maximumturn = xSize*ySize/2;

        Board board1 = new Board(xSize,ySize);
        Stone black = new Black();
        Stone white = new White();

        board1.createBoard();

        int i = 0;
        
        while( i < maximumturn){
            System.out.printf("\nTurn No. %d ",i+1);
            System.out.println();
            i++;
            white.placeStoneEx(board1, xSize, ySize);
            board1.printBoard();
            board1.checkWin();
            black.placeStoneEx(board1, xSize, ySize);
            board1.printBoard();
            board1.checkWin();
        }
        System.out.println("END");
        System.out.println(maximumturn);
        
    }

    
    
}
