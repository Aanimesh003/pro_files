import java.util.*;
 class pallinstring {
    public static boolean ispallin(String str)
    { 
      for(int i =0;i<str.length()/2;i++)
      {
        if(str.charAt(i) != str.charAt(str.length()-1-i))
        return false;
      }  
      return true;
    }
    public static void main(String aargs[])
    {  Scanner sc = new Scanner(System.in);
        System.out.println("enter the string you want to check");
        String str = sc.next();
        System.out.println(ispallin(str));
        sc.close();
    }
}