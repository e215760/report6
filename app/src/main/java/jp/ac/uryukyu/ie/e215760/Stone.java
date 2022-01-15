package jp.ac.uryukyu.ie.e215760;

/**
 * 碁石(player)のクラス。
 * int name;　playerの名前。
 * boolean win;　playerの勝ち負け。
 */
public class Stone{
    int name;
    boolean win;
    
    /**
     * コンストラクタ。
     * nameは
     * "0" = null
     * "1" = white
     * "2" = black
     * winの初期値はfalse;
     */
    public Stone(){
        this.name = 0;
        this.win = false;
    }

    /**
     * ボードに碁石を置くメソッド。
     * x軸とy軸に乱数を利用して碁石を置く。
     * もし、碁石が既に存在する時、再帰して再試行する。
     * @param _board　現在ボードのマスの状況。
     * @param xSize　x軸の最大値。
     * @param ySize　y軸の最大値。
     */
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
