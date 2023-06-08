import java.util.*;
public class bit_manipulation 
{
    public static void evenorodd(int n)
    {
        int bitmask = 1;
        if((n & bitmask)==0)
        System.out.println("even number");
        else 
        System.out.println("odd number");
    }
    public static int getithbit(int n,int i)
    {
      int bitmask = (1<<i);
      if((n & bitmask) == 0)
      return 0;
      else 
      return 1;
    }
    public static int setithbit(int n, int i)
    {
      int bitmask = (1<<i);
      return n|(bitmask);
    }
    public static int clearithbit(int n,int i)
    { int bitmask = (1<<i);
      return n^(bitmask);
    }
    public static int updateithbit(int n ,int i , int nbit)
    {
      //if(nbit==0)
      //return clearithbit(n,i);
      //else
       //return setithbit(n,i);

       n =  clearithbit(n,i);
      int bitmask =  (nbit<<i);
      return n|(bitmask);
    }
    public static int clearlastibtis(int n ,int i)
    {
     int bitmask = ((-1)<<i);
     return n&(bitmask);

    }
    public static int clearangeofbits(int n,int i,int j)
    {
      int a = ((~0)<<j+1);
      int b = (1<<i -1);
      int bitmask = a|b;
      return n&bitmask;
    }
    public static int swap_binary(int x,int y)
    { 
      System.out.println("vslue of x is "+x+" and value of y is "+y);
      x= x^y;
      y=x^y;
      x=x^y;
      System.out.println("now x = "+x+" y = "+y);
      return 0;
    }
    public static int countbits(int n)
    { /*using left shift operator
      int c=0;
      for(int i=0;i<=(int)(Math.log(n)/Math.log(2));i++)
      {
        if((n&(1<<i))!=0)
        c++;
      }*/
      //using right shift operator 
      int c=0;
      while(n>0)
      {
        if((n&1)!= 0) // checking the lsb for 1 or 0 
        c++;

        n=(n>>1);
      }
      return c;
    }
    public static boolean poweroftwo(int n)
    {
      return ((n&(n-1)) ==0);
    }
    public static int fastexponentiation(int n,int pow)
    {
      int ans =1;
      while(pow>0)
      {
      if((pow&1)!=0)
      {
        ans = ans*n;
      }       
      n = n*n;
      pow = pow>>1; 
    }
      return ans;
    }
    public static int stringtoint(String s)
    {
      int n = Integer.parseInt(s);
      return n;
    }
    public static void main (String args[])
    {
      //System.out.println(getithbit(14, 2));
      //System.out.println(setithbit(14, 2)); 
      //System.out.println(clearithbit(23, 4));
     // System.out.println(clearlastibtis(15, 2));
     // System.out.println(clearangeofbits(31, 2, 3));
     // System.out.println(swap_binary(15,10));
      //System.out.println(updateithbit(14, 2, 0));
    // System.out.println(countbits(30));
    //System.out.println(fastexponentiation(5, 4));
     //System.out.println(poweroftwo(32));
     //String s = "1101";
     //System.out.println(stringtoint(s));
     Codechef c = new Codechef();
     Codechef.check();
     Codechef.display();

     
    }
    
}
class Codechef
{
	public static void check()
	{ 
    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++)
		{
		    String s = sc.next();
		    int a = Integer.parseInt(s);
		    int c=0;
        while(a>0)
        {
         if((a&1)!= 0) 
         c++;
         a=(a>>1);
        }
        if(c==2||c==3)
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
		}
	}
  static void display()
        {
          System.out.println("hello");
        }
}
