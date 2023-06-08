public class searchinsorted {
    public static boolean staircase_search(int arr[][],int key)
    {
        int row=0,col = arr[0].length-1;
    while(row <= arr.length && col>=0)
    {
       if (key==arr[row][col])
       {System.out.println("key found at"+"("+row+","+col+")");
       return true;}
       else if(key < arr[row][col])
       col--;
       else 
       row++;
    }
    System.out.println("key not found!");
    return false;
}

public static void main(String args[])
{
int [][] arr = {{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
 System.out.println(staircase_search(arr,32));               
}
}
