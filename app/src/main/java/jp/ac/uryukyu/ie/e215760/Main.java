package jp.ac.uryukyu.ie.e215760;
public class Main {
    public static void main(String[] args){
        int xSize = 7;
        int ySize = 7;

        Board board1 = new Board(xSize,ySize);
        Stone black = new Black();
        Stone white = new White();
        board1.createBorad();
        board1.printBorad();
        int i = 0;
        while( i <= 9){
            System.out.println(i);
            board1.placeStone(white.name);
            board1.placeStone(black.name);
            i++;
            board1.printBorad();
        }
        System.out.println("END");
    }

    
    
}
