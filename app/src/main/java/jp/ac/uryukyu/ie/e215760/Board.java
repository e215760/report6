package jp.ac.uryukyu.ie.e215760;
/**
 * 보드 클라스
 * int[][] board는 보드의 상태
 */
public class Board {
    int[][] board;
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
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[x].length; y++){
                switch(board[x][y]){
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
    public void placeStone(int name, int coordX ,int coordY){ 
            if (board[coordY][coordX] == 0){
                board[coordY][coordX] = name;
            }
            else{
                System.out.println(" --- " + name + " is reTry ---");
                int reCoordX = (int)(Math.random() * board.length);
                int reCoordY = (int)(Math.random() * board.length); 
                placeStone(name, reCoordX , reCoordY);
            }
    }

    public void checkWin(){
        
    }

}

