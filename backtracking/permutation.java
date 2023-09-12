public class permutation {
    public static void permu(String str,String ans){
        //base
        if(str.length() == 0)
        {System.out.println(ans);
        return;}
        
        //recursion
        for(int i=0;i<str.length();i++)
        {  
           char current = str.charAt(i);
           String newstr = str.substring(0, i) + str.substring(i+1);
           permu(newstr, ans+current);
        }
    }
    public static void main(String args[])
    {
        String str = "abc";
        String ans="";
        permu(str, ans);
    }
}
