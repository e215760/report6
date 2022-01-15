package jp.ac.uryukyu.ie.e215760;
/**
 * Boardクラス。
 * int[][] board; ボードの状況。
 * boolean gameEnd; ゲームが終わったかを確認。　true　= ゲーム終了。
 */
public class Board {
    int[][] board;
    boolean gameEnd = false;

    /**
     * コンストラクター。ボードのx軸とy軸を設定。
     * @param _x x軸の最大値。
     * @param _y y軸の最大値。
     */
    public Board(int _x,int _y){
        this.board = new int[_y][_x];
    }

    /**
     *  ボードの大きさによって全てのマスを０に初期化する。
     */
    public void createBoard(){
        for(int i=0 ; i < board.length; i++){
            for(int j = 0; j< board[i].length; j++){
                board[i][j] = 0;
            }
        }
    }

    /**
     * 現在ボードの状況を出力してくれるメソッド。
     * "0" = null
     * "1" = white
     * "2" = black
     */
    public void printBoard(){
        for(int y = 0; y < board.length; y++){
            for(int x = 0; x < board[y].length; x++){
                switch(board[y][x]){
                    case 0 :
                        System.out.printf(" *");
                        break;
                    case 1 :
                        System.out.printf(" ●");
                        break;
                    case 2 :
                        System.out.printf(" ○");
                        break;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        
    /**
     * ゲームの終わりの確認と誰が優勝したのかを確認。
     * @param stone　確認するプレイヤーの情報。
     */
    public void check(Stone stone){
        for(int y =0; y < board.length ; y++){
            for(int x=0; x< board[y].length ; x++){
                if(board[y][x] != 0 ){
                    int count = 0;
                    int check = stone.name;
                    //->
                    try{
                        for (int as = 0 ; as <5; as++){
                            if(board[y][x+as] == stone.name){
                                count ++;
                                if(count ==5){
                                    System.out.println("-> x = " + (x+1) + " y = " + (y+1));
                                    gameEnd = true;
                                    stone.win = true;
                                }
                            }
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                    }
                    count = 0;
                    //↓
                    try{
                        for (int as = 0 ; as <5; as++){
                            if(board[y+as][x] == check){
                                count ++;
                                if(count ==5){
                                    System.out.println("↓ x = " + (x+1) + " y = " + (y+1));
                                    gameEnd = true;
                                    stone.win = true;
                                }
                            }
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                    }
                    count = 0;
                    //⇨↓
                    try{
                        for (int as = 0 ; as <5; as++){
                            if(board[y+as][x+as] == check){
                                count ++;
                                if(count ==5){
                                    System.out.println("⇨↓ x = " + (x+1) + " y = " + (y+1));
                                    gameEnd = true;
                                    stone.win = true;
                                }
                            }
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                    }
                    count = 0;
                    //←↓
                    try{
                        for (int as = 0 ; as <5; as++){
                            if(board[y+as][x-as] == check){
                                count ++;
                                if(count ==5){
                                    System.out.println("←↓ x = " + (x+1) + " y = " + (y+1));
                                    gameEnd = true;
                                    stone.win = true;
                                }
                            }
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                    }
                }   
            }
        }
    }

    /**
     * 勝者を確認し、ゲームを終了してくれるメソッド。
     * @param stone　確認するプレイヤーの情報。
     * 
     */
    public void isWin(Stone stone){
        if (this.gameEnd == true){
            if(stone.name == 1){
                System.out.println("White is Win!");
                System.exit(0);
            }
            else{
                System.out.println("Black is Win");
                System.exit(0);
            }
        }

    }
        
}




