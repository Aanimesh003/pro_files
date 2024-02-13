package matrix;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicate_from_sorted {

    public static int brute_force(int []arr, int n){

        Set <Integer> set = new LinkedHashSet<>();


        for(int i =0;i<arr.length;i++)
        {
             set.add(arr[i]);
             
        }

        Iterator<Integer> iterator = set.iterator();

        int i =0;
        while(iterator.hasNext())
        {
           
           arr[i]=iterator.next();
           i++;
        }
        return i;
    }
    
    public static void main(String args[])
    {
        int arr []= {1,1,1,2,2,3,3,3};
    
         brute_force(arr, arr.length);
    }
}
