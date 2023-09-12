
public class arrays_back
{

    public static void change_value(int arr[],int i , int val){
     
        if(i==arr.length)
        {print(arr);
        return;}

         arr[i] = val;
         change_value(arr, i+1, val+1);
         arr[i] -= 2;
    }

    public static void print(int []arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
      int [] arr = new int[5];
      change_value(arr, 0 ,1);
      print(arr);
    }
}