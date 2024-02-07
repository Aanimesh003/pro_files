
public class kk {
    public static void main(String args[]) {
        //initialize
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        //access
        System.out.println(sb.charAt(2));
        //replace
        sb.setCharAt(0,'P');
        System.out.println(sb);
        //insert
        sb.insert(0,'S');
        System.out.println(sb);
        
    }
}

