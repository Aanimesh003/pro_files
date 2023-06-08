public class builderuse {
    public static String touppercase(String str)
    {
    // invalid charachter constant 
    /*
     * we cannot use '' to represent blank space because it will be trated as invalid character constant whereas,
     *  if we want we can use '\0' or (char) 0 for null character.
     *  if we want to check for '' we can use Character.isWhitespace(str.charAt(i)).
     */
     StringBuilder sb = new StringBuilder("");
    char ch =Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i =1 ; i<str.length(); i++)
    {
        if(Character.isWhitespace(str.charAt(i)) && i<=str.length()-1 ) 
        { 
          sb.append(str.charAt(i));  
          i++;
          sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else 
        sb.append(str.charAt(i));

    }
    return sb.toString();
    } 
    public static void main(String args[])
    { 
        String str = "hi, i am animesh";
        System.out.println(touppercase(str));

    }
    
}
