package jp.ac.uryukyu.ie.e215760;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        int xSize = 10;
        int ySize = 10;
        int maximumturn = xSize*ySize/2;

        Board board1 = new Board(xSize,ySize);
        Stone white = new White();
        Stone black = new Black();
        ArrayList<Stone> order = new ArrayList<>();
        order.add(white);
        order.add(black);
        
        board1.createBoard();

        int i = 0;

        while( i < maximumturn){
            i++;
            for( var playGame : order){
                playGame.placeStoneEx(board1, xSize, ySize);
                board1.printBoard();
                board1.check(playGame);
                board1.isWin(playGame);
            }

        }
        System.out.println("Draw");

    }

    
}
