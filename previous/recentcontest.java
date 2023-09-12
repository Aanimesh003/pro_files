import java.util.*;
public class recentcontest {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=1;i<T;i++){
        int s=0,l=0;
    int n = sc.nextInt();
    String str = sc.nextLine();
    String [] ar = str.split(" ");
    for(int k=0;k<n;k++){
        if(ar[k].equals("START38"))
        s++;
        else
        l++;
    }
    System.out.print(s+""+l);
    }
    sc.close();
    }
}
