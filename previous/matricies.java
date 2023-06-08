
class matrix
{
    //printing a 2d matrix in a spiral format
    public static void spiral(int ar[][])
    {
      int sr,sc,er,ec;
      sr = 0;
      sc = 0;
      er = ar.length-1;
      ec = ar[0].length-1;

      while(sr<=er && sc<=ec)
      {
        //top
        for(int j=sc;j<=ec;j++)
        {
            System.out.print(ar[sr][j]+" ");
        }
        //right
        for(int i=sr+1;i<=er;i++)
        {
            System.out.print(ar[i][er]+" ");
        }
        //bottom
        for(int j=ec-1;j>=sc;j--)
        { if(sr==er)
            break;
            System.out.print(ar[er][j]+" ");
        }
        //left
        for(int i=er-1;i>=sr+1;i--)
        {   if(sc==ec)
             break;
            System.out.print(ar[i][sc]+" ");
        }
        sr++;
        sc++;
        ec--;
        er--;
      }
      System.out.println();
    
    }
public static void main(String args[])
{
    int [][]ar = {{1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16}};
    spiral(ar);
}
}