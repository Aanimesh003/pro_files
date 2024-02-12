public class string_subset {
    public static void sub(String str,String ans,int i)
    { if(i==str.length())
        {System.out.println(ans);
         return;}

       //yes 
       sub(str, ans+str.charAt(i), i+1);
       //no
       sub(str, ans, i+1);
    }
    public static void main(String args[])
    {
        String str ="abcd";
        sub(str,"",0);
    }
}
