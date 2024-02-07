import java.util.*;
public class Seive_of_Erotasthenes {
 
    static void seiveprime(int n)
    {
        int prime[] = new int[100];
     
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==0)
            for(int j=i*i;j<=n;j+=i)
            {
              prime[j]=1;
            }
        }

        for(int i =2;i<=n;i++)
        {
            if(prime[i]==0)
            System.out.print(i+" ");
        }
    }
    

    public static void main(String [] args)
    {
        System.out.println("enter the range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        seiveprime(n);
        sc.close();
    }
}
