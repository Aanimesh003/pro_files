import javax.lang.model.util.ElementScanner14;

public class divide_conquer {
    public static void print(int arr[])
    {
       for(int i =0;i<arr.length;i++)
       {

        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public static void mergesort(int []arr ,int si , int ei)
    {   if(si>=ei)
        return;
        int mid = si +(ei-si)/2;
        System.out.println("left subpart");
        mergesort(arr, 0, mid);
        System.out.println("right subpart");
        mergesort(arr, mid+1, ei);
        System.out.println("merging");
        merge( arr, si , ei, mid);
    }
    public static void merge(int []arr,int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid&&j<=ei)
        {
            if(arr[i]<arr[j])
            {temp[k]=arr[i];
                i++;}
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

            for(k=0,i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }
    }
    public static void quicksort(int [] arr,int si,int ei){
    if(si<ei)   
    { 
    int pidx = partition(arr,si,ei);
    quicksort(arr, si, pidx-1);
    quicksort(arr, pidx+1, ei);}
    }
    public static int partition(int []arr,int si,int ei){
        int pivot = arr[ei];
        int i =si-1;
        int temp;
        for(int j =si;j<ei;j++)
        {
        if(arr[j]<=pivot){
        i++;
        //swap
        temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }}
    i++;
    temp = pivot;
    pivot = arr[i];
    arr[i]=temp;
    return i;
    }

    //search in sorted and rotated array 
    public static int search(int []arr,int si,int ei,int tar){
        if(si>ei){
            return -2;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid]==tar)
        {
            return mid;
        }
        if(arr[si]<=arr[mid])
        {
            if(arr[si]<=tar&&tar<=arr[mid-1])
            {return search(arr, si, mid-1, tar);}
               else
            {return search(arr, mid+1, ei, tar);}}

         else
         {
            if(arr[mid]<=tar&&tar <= arr[ei])
             {return search(arr, mid+1, ei, tar);}
             else
             {return search(arr, si,mid-1, tar);}
         }
        
    }
    
    public static void main(String args[]){
        int [] arr = {6,3,2,7,1,9};
        mergesort(arr, 0, arr.length-1);
        //quicksort(arr, 0, arr.length-1);
        // int a = search(arr, 0, arr.length-1, 1);
        // System.out.println(a);
    }
}
