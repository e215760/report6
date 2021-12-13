package jp.ac.uryukyu.ie.e215760;
public class Board {
    int[][] board;
    public Board(int _x,int _y){
        this.board = new int[_x][_y];
    }

    public void createBorad(){
        for(int i=0 ; i < board.length; i++){
            
            for(int j = 0; j< board[i].length; j++){
                board[i][j] = 0;
            }
        }
    }

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

    public void placeStone(int name){
            int coordX = (int)(Math.random() * board.length);
            int coordY = (int)(Math.random() * board.length);   
            if (board[coordX][coordY] == 0){
                board[coordX][coordY] = name;
            }
            else{
                System.out.println(name+"reTry");
                placeStone(name);
            }
    }
}

