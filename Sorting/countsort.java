import java.util.*;

public class countsort {
    public static int[] sssort(int arr[]){
        int n = arr.length;
        System.out.println("hello ");
        int[] count = new int[n];
        
        for (int i = 0;i<n;i++){

            for(int j = 0 ; j<n; j++){
                if (arr[i]==j)
                    count[j]++;
            }
        }
        int j = 0;
        for (int i = 0;i<n;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return count;

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

        sssort(arr);
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
    

