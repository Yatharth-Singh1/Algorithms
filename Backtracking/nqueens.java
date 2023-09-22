package Backtracking;

public class nqueens {
    public static boolean istrue(char board[][],int row, int col){

        for (int i = row-1; i>=0;i--){
            if (board[i][col]=='Q'){
                return false;
            }
        }
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--,j--){
             if (board[i][j]=='Q'){
                return false;
            }
        }
         for(int i = row-1, j = col+1; i>=0 && j <board.length; i--,j++){
             if (board[i][j]=='Q'){
                return false;
            }
        }
        
        return true;
    }
    public static void placequeen(char board[][],int i){
        if (i==board.length){
            print(board);
            return;
        }    
        for (int j = 0; j< board.length;j++){
            if ( istrue(board,i,j))
            {
            board[i][j]='Q';
            placequeen(board, i+1);
            board[i][j]='*';
            }
        }
    }
    public static void print(char board[][]){
        int n = board.length;
        System.out.println("-----Board-----");
         for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(board[i][j]);           
             }
             System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char [n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j]='*';           
             }
        }
        placequeen(board,0);
    }
}
