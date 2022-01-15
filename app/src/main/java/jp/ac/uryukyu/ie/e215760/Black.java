package jp.ac.uryukyu.ie.e215760;

/**
* 黒の碁石のクラス
* nameは
* "0" = null
* "1" = white
* "2" = black
* winの初期値はfalse;
*/
public class Black extends Stone{
    
    /**
     * コンストラクタ。
     * Blackで生成すると名前が2になる。
     */
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
            placeStoneEx(_board, xSize, ySize);
        }
    }
}

