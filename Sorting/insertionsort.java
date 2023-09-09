import java.util.*;

public class insertionsort {
    public static int[] ssort(int arr[]){
        int n = arr.length;

        for (int i =1; i < n; i++){

           int curr = i;
           int prev = i-1;
           int store = arr[curr]; 
            while(prev>=0 && arr[prev]> store){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1] = store;

        }
        return arr;

    }
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements for array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elments of array ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        arr = ssort(arr);
        System.out.println();
        System.out.println("Sorted array is:");
        System.out.println();
        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i]+ " ");
        }
        sc.close();
      }

    
}
    

