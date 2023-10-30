public class grid_ways {
    public static int  gridways(int i,int j,int n,int m)
    {
        //base 
        if(i==n-1 && j==m-1)
        return 1;
        int way1=gridways(+1, j, n, m);
        int way2=gridways(i, j+1, n, m);
        return way1+way2;

    }
    public static void main(String args[])
    {
      int n =3,m=3;
      System.out.println(gridways(0,0,n,m));
    }
}
