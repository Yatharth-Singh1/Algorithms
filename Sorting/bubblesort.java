import java.util.*;

public class bubblesort {
    public static int[] sort(int arr[]){
        int n = arr.length;
        for (int i =0; i < n-1; i++){

            for (int j =0;j<n-1-i;j++){
               
                if (arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
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

        arr = sort(arr);
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