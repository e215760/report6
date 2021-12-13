package jp.ac.uryukyu.ie.e215760;
public class Main {
    public static void main(String[] args){
        int xSize = 10;
        int ySize = 10;

        Board board1 = new Board(xSize,ySize);
        Stone black = new Black();
        Stone white = new White();
        board1.createBorad();
        int i = 0;
        while( i <= 9){
            System.out.printf("No. %d ",i);
            System.out.println();
            board1.placeStone(white.name);
            board1.placeStone(black.name);
            i++;
            board1.printBorad();
        }
        System.out.println("END");
    }

    
    
}
