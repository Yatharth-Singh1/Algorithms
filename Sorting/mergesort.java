import java.util.*;

public class mergesort {
    
    public static void mergeSort (int arr[], int st, int en){
        
        if (st>=en){
            return;
        }
        
        int mid = st+(en-st)/2;
        mergeSort( arr, st, mid );
        mergeSort( arr, mid+1, en);

        merge(arr, st, mid, en) ;
    }

    public static void merge(int arr[], int st, int mid, int en){
        int temp[] = new int [en-st+1];
       
        int i = st; // iterator for left side
        int j = mid+1; // iterator for right side
        int k = 0; // iterator for temp array
        
        while(i<=mid && j<=en){
            if (arr[i] < arr[j]){
                temp[k]= arr[i];
                i++;
                
            }
            else{
                 temp[k]= arr[j];
                j++;
            }
           k++; 
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=en){
            temp[k++]=arr[j++];
        }
        
        for (k=0,i=st; k< temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void print(int arr[]){
        for (int i=0; i< arr.length;i++ ){
            System.out.println(arr[i]);
        }
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
        int len = arr.length -1;
        mergeSort(arr, 0,len );
        System.out.println();
        System.out.println("Sorted array is:");
        System.out.println();
        
        print(arr);
        sc.close();
      }

    
}
    

