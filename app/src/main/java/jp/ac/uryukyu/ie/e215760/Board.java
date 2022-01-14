package jp.ac.uryukyu.ie.e215760;
/**
 * 보드 클라스
 * int[][] board는 보드의 상태
 */
public class Board {
    int[][] board;
    boolean gameEnd = false;

    public Board(int _x,int _y){
        this.board = new int[_y][_x];
    }
    /**
     *  보드를 초기화 시켜준다.
     */
    public void createBoard(){
        for(int i=0 ; i < board.length; i++){
            for(int j = 0; j< board[i].length; j++){
                board[i][j] = 0;
            }
        }
    }
    /**
     * 현재 보드의 상태를 보여주는 매소드.
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
         * 돌을 보드에 놓는 매소드.
         * @param name
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




