package matrix;
public class Rotate_matrix {

    
    public static void column_transpose_matrix(int [][]arr , int  n)
    { 
        int k=0;
        
        for(int i=n-1;i>=n/2;i--)
        {
            for(int j=0;j<n;j++)
            {
                int temp = arr[j][k];
                arr[j][k]= arr[j][i];
                arr[j][i]=temp;
            }
            k++;
        }
    }

    public static void transpose_matrix(int [][]arr , int  n)
    { 
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }
    }


    public static void display(int [][] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
    public static void main(String args[])
    {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

          transpose_matrix(matrix,matrix.length);
          //display(matrix,matrix.length);
          column_transpose_matrix(matrix,matrix.length);
          display(matrix, matrix.length);

    }

}
