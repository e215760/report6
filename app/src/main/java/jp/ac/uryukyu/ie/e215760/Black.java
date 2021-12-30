package jp.ac.uryukyu.ie.e215760;

public class Black extends Stone{
    //black = 2
    public Black(){
        this.name = 2;
    }
    @Override
    public void placeStoneEx(Board _board,int xSize, int ySize) {
        int x = (int)(Math.random() * xSize);
        int y = (int)(Math.random() * ySize);
        if(_board.board[y][x] == 0){
            _board.board[y][x] = 2;
        }
        else{
            System.out.println(" ---- "+ name + " is retry ----");
            placeStoneEx(_board, xSize, ySize);
        }
    }
}

