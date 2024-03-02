public class set_matrix_zero
{
    //Brute force - invloves traversing the complete matrix and then assinging -1 to those elements which are not equal to 0.
    //at every pos where we marked the elements as -1, we change  the array element  as 0
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {set_row(i,matrix);
                set_column(j,matrix);}
            }
        }
            for(int i =0;i<n;i++)
           {
            for(int j =0;j<m;j++)
            {
            if(matrix[i][j]==-1)
            matrix[i][j]=0;
            
            }}
        }
        //better approach for setting the columns and rows of the elements that intially contain zero as zero.
        //Time complexity of the code is O(n*m)
        public static void beter_approach(int [][]matrix)
        {
            int row [] = new int[matrix.length];
            int col [] = new int[matrix[0].length]; 
            for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    if(matrix[i][j]==0)
                    {row[i]=1;
                    col[j]=1;}
                }
            }
            for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                   if(row[i] == 1||col[j]==1)
                   matrix[i][j]=0;
                }}
        }
    
    public static void set_row(int i,int [][] matrix)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]!=0)
            matrix[i][j]=-1;
        }
    }
     public static void set_column(int j,int [][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][j]!=0)
            matrix[i][j]=-1;
        }
    }

    public static void optimal_approach(int [][] matrix)
    {
        int col0=1;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                matrix[i][0]=0;
                if(j!=0)
                matrix[0][j]=0;
                else 
                col0=0;
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
              if(matrix[i][j] != 0)
               {
               if(matrix[i][0] == 0 || matrix[0][j]==0)
               matrix[i][j]=0;}
            }
            }
            
            if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
            matrix[0][j] = 0;
        }
        }
           if (col0 == 0) {
          for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
        }
    }
    }
    public static void main(String args[])
    {
        int arr[][] ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(arr);

        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}