import java.util.*;
public class Recusrion {
    public static void dec(int n)
    {
       if(n==1)
       {System.out.print(n+" ");
       return;}
       System.out.print(n+" ");
       dec(n-1);
    }
    public static void Inc(int n)
    {
      if(n==1)
      {System.out.print(n+" ");
      return;}
      Inc(n-1);
      System.out.print(n+" ");
    }

    public static int naturalnum(int n)
    {
      if(n==1)
      return 1;
      else 
      return (n+naturalnum(n-1));
    }

    public static int fibo(int n)
    {
      if(n==0 || n==1)
      return n;
      else 
      return fibo(n-1)+fibo(n-2);
    }
    public static boolean issorted(int arr[],int i)
    { if(i==arr.length-1)
      {return true;}
      if(arr[i]>arr[i+1])
     { return false;
    }
      return issorted(arr,i+1);
    }
    public static int firstoccurence(int arr[],int key,int i)
    {
      if(i==arr.length)
      return -1;
      if(arr[i]==key)
      {return i;}
      return firstoccurence(arr, key, i+1);
      
    }
    public static int lastoccurence(int arr[],int key,int i)
    {
      if(i==arr.length)
      return -1;
      int isfound = lastoccurence(arr, key, i+1);
      if(isfound== -1 && arr[i]==key)
      return i;

      return isfound;
    }
    public static int pow(int x,int n)
    {
      if(n==0)
      return 1;
      return x*pow(x,n-1);
    }
    public static int optipow(int x,int n)
    {
      if(n==0)
      return 1;
      int halfpow = optipow(x,n/2);
      int halfsq = halfpow*halfpow;
      if(n%2!=0)
      {
        halfsq = x*(halfsq);
      }
      return halfsq;

    }
    public static void occurences(int arr[],int key,int i)
    {
      if(i==arr.length)
      return;
      if(arr[i]==key)
      System.out.print(i+" ");
      occurences(arr, key, i+1);
    }
    public static void printdigits(int n)
    {
      String ar[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
       if(n==0)
       return;
       int last_digit= n%10;
       printdigits(n/10);
       System.out.print(ar[last_digit]+" ");
    }
    public static int length(String str)
    {
      if(str.length()==0)
      return 0;
      return length(str.substring(1))+1;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        //int n =sc.nextInt();
        // Inc(n);
        // dec(n); 
        // naturalnum(n);
        // int a = fibo(n);
        // System.out.println(a);
        int arr [] = {3,2,4,5,6,2,7,2,2};
       
        //System.out.println(issorted(arr,0));
        // System.out.println(firstoccurence(arr, 5, 0));
        // System.out.println(lastoccurence(arr, 5, 0));
        // System.out.println(pow(2,30));
        // System.out.println(optipow(4, 15));
        occurences(arr, 2, 0);
        System.out.println();
        printdigits(2345);
        System.out.println();
       System.out.println(length("ahhdsw")); 
        sc.close();
    }
}
