package jp.ac.uryukyu.ie.e215760;

public class White extends Stone{
    //white = 1
    public White(){
        this.name = 1;
    }
    
    @Override
    public void placeStoneEx(Board _board,int xSize, int ySize) {
        int x = (int)(Math.random() * xSize);
        int y = (int)(Math.random() * ySize);
        if(_board.board[y][x] == 0){
            _board.board[y][x] = 1;
        }
        else{
            placeStoneEx(_board, xSize, ySize);
        }
    }
}
