public class tiling {

    public static int tileproblem(int n){//2Xn = floor size

        // //base case 
         if(n==0||n==1)
         return 1;
        // //vertically
        // int vertical = tileproblem(n-1);
        // //horizontally
        // int horizontal = tileproblem(n-2);
        // int totalways = vertical+horizontal;
        // return totalways;
        return tileproblem(n-1)+tileproblem(n-2);
    }
    public static int friendpair(int n)
    {
        if(n==1||n==2)
        return n;
        
        return friendpair(n-1)+(n*1)*friendpair(n-2);
    }
    public static void main(String args[])
    {
        System.out.println(tileproblem(5));
        System.out.println(friendpair(3));
    }
}
