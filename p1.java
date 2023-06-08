import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p1 {
    public static void peter(String arr[])
    {
        
    }
    public static void  majele(int [] arr,int si,int ei)
    { if(si>=ei)
      return;
      int mid = si+(ei-si)/2;
      majele(arr,si,mid);
      majele(arr,mid+1,ei); 
      merge(arr,si,ei,mid);
    }
    public static void merge(int [] arr,int si ,int ei,int mid)
    {
       int temp[]= new int[ei-si+1];
       int i = si;
       int j = mid+1;
       int k=0;
       while(i<=mid&&j<=ei)
       {
        if(arr[i]<arr[j])
        {temp[k]=arr[i];
          i++;
        }
        else
        {
          temp[k]= arr[j];
          j++;
        }
        k++;
       }
       while(i<=mid)
       {
        temp[k++]=arr[i++];
       }
       while(j<=ei)
       {
        temp[k++]=arr[j++];
       }
       for(k=0,i=si;i<=arr.length-1;k++,i++){
        arr[i]=temp[k];
       }
    }
    public static int major(int []arr,int n)
    {
  
     Map<Integer, Integer> mp = new HashMap<>();

     for(int i =0;i<=n;i++)
     {
      if(mp.containsKey(arr[i]))
      {
        mp.put(arr[i],mp.get(arr[i])+1);
      }
      else
      {
        mp.put(arr[i],1);
      }

     }
     int max =0;
     int key=0;
    for(Map.Entry<Integer,Integer> entry : mp.entrySet())
    { 
      if(max<entry.getValue());
      {max = entry.getValue();
      key= entry.getKey();}}
     return key;
      }
    public static void main(String args[])
    {
       // String arr[] = {"sun","mars","mercury","earth"};
       // peter(arr);
       int arr[]= {1,2,6,2,6,6,7,6};
       //majele(arr, 0, arr.length-1);
       //Arrays.sort(arr);
       int a = major(arr, arr.length-1);
       System.out.println(a);
       
    }
}
