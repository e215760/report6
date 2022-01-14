package jp.ac.uryukyu.ie.e215760;


public class Stone{
    int name;
    boolean win;
    
    public Stone(){
        this.name = 0;
        this.win = false;
    }

    public void placeStoneEx(Board _board, int xSize, int ySize){
        int x = (int)(Math.random() * xSize);
        int y = (int)(Math.random() * ySize);
        if(_board.board[y][x] == 0){
            _board.board[y][x] = 0;
        }
        else{
            placeStoneEx(_board, xSize, ySize);
        }
    }
}
