public class diagonal {
    /*conditions to keep in mind

    pd - (i==j)||(i-j==0)
    sd - (i+j == ar.length-1)
    => j = ar.length-1-i;
    we know that ar[i][j] we ccan print the element at desried location therefore,
    we can use the above concept to solve the same                 
     */
    public static void diagonalsum(int a[][])
    {
       int sum = 0 ;
       for(int i = 0 ; i<a.length;i++)
       {
        sum += a[i][i];
        if(i!=a.length-i-1)
        sum += a[i][a.length-i-1];
       }   
       System.out.println("the sum of the diagonal is "+sum);
    }
    public static void main(String args[])
    {
        int [][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        diagonalsum(arr);
    }
}

public class A  {



}
