package Backtracking;

public class backtrackinginarray {

    public static void backtrack(int arr[],int i,int val){
        //base case
        if (i==arr.length){
            printArr(arr);
            return;
        }
        // recurtion 
        arr[i]= val;
        backtrack(arr,i+1,val+1);  // funxtion cond.
        arr[i] = arr[i]-2;              //backtracking step
    }
    public static void printArr(int arr[]){
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int [5];
        backtrack(arr, 0, 0);
        printArr(arr);
    }
}
