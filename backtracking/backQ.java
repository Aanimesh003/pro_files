public class  backQ
 {
    public static  boolean issafe(char board[][],int row, int col)
    {
        //vertical
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            return false;
        } 

        // left diagonal up 
        for(int i =row-1,j=col-1;j>=0 && i>=0;j--,i--)
        {
            if(board[i][j]=='Q')
            return false;
        }

        //right diagonal up 
        for(int i=row-1,j=col+1;i>=0 && j<=board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            return false;
        }

        return true;

    }
    public static void nqueens(char board[][], int row){

        //base case
        if(row == board.length)
        {printboard(board);
        return;}
        
        //recursive case
        for(int i = 0;i<board.length;i++)
        {
            if(issafe(board,row,i))
            {
            board[row][i]='Q';
            nqueens(board, row+1);
            board[row][i]='x';}
        }
    
}
 public static void printboard(char board[][])
 {
    for(int i =0;i<board.length;i++)
    {
        for(int j=0;j<board.length;j++)
        {
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
 }
 public static void main(String args[])
 {
    int n =4;
    char board[][] = new char[n][n];
    for(int i =0 ; i<n;i++)
    {
        for(int j =0;j<n;j++)
        {
            board[i][j] = '.';
        }
    }

 }
}

