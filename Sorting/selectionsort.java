import java.util.*;

public class selectionsort {
    public static int[] ssort(int arr[]){
        int n = arr.length;
        System.out.println("Hello");
        for (int i =0; i < n-1; i++){

            int minpos = i;

            for (int j =i+1;j<n;j++){
    
                if (arr[minpos] > arr[j]){
                    minpos = j;
                }
            }

            //swap
            int swap = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = swap;
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