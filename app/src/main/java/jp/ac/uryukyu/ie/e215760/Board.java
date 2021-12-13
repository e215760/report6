package jp.ac.uryukyu.ie.e215760;
/**
 * 보드 클라스
 * int[][] board는 보드의 상태
 */
public class Board {
    int[][] board;
    public Board(int _x,int _y){
        this.board = new int[_x][_y];
    }
    /**
     *  보드를 초기화 시켜준다.
     */
    public void createBorad(){
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
    public void printBorad(){
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[x].length; y++){
                switch(board[x][y]){
                    case 0 :
                        System.out.printf("*");
                        break;
                    case 1 :
                        System.out.printf("W");
                        break;
                    case 2 :
                        System.out.printf("B");
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
    public void placeStone(int name){
            int coordX = (int)(Math.random() * board.length);
            int coordY = (int)(Math.random() * board.length);   
            if (board[coordX][coordY] == 0){
                board[coordX][coordY] = name;
            }
            else{
                System.out.println(name+" is reTry");
                placeStone(name);
            }
    }

    public void checkWin(){
        
    }

}

