package stack;
import java.util.*;
public class maxareahistogram {
    public static int[] checknext(int arr[]){
        Stack<Integer> s = new Stack();
        int i = arr.length-1;
        int l = i;
        int arr2[] = new int[i+1];
        for (i=arr.length-1;i>=0;i--){
        while(!(s.size()==0) && arr[i]<arr[s.peek()]){

            s.pop();
            
        }
        if (s.size()==0){
            arr2[i] = l+1;
        }
        else
            arr2[i] = s.peek();
        
        s.push(i);
        }
        return arr2;
    }
public static int[] checklast(int arr[]){
        Stack<Integer> s = new Stack();
        int i = arr.length-1;
        int l = i;
        int arr2[] = new int[i+1];
        for (i =0;i<arr.length;i++){
        while(!(s.size()==0) && arr[i]<arr[s.peek()]){

            s.pop();
            
        }
        if (s.size()==0){
            arr2[i] = -1;
        }
        else
            arr2[i] = s.peek();
        
        s.push(i);
        }
        return arr2;
    }
    
    public static void main(String argss[]){
        int arr[] = {2,1,5,6,2,3};
        int arr2[] = checknext(arr);
        int arr3[] = checklast(arr);
        int area[] = new int[arr.length];
        int max = 0;
        
        for (int i =0;i<area.length;i++){
            area[i] = arr[i]*(arr2[i]-arr3[i]-1);
            System.out.print(area[i]+" ");
        }
        for (int i =0;i<area.length;i++){
            if (max<area[i]){
                max= area[i];
            }
        }
        System.out.println();
        System.out.println(max);
        
        System.out.println();
         System.out.println();
        for (int i =0;i<arr2.length;i++){
            area[i] = arr[i]*(arr2[i]-arr3[i]-1);
            System.out.print(area[i]+" ");
        }
        System.out.println();
        for (int i =0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for (int i =0;i<arr2.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
    
    
}
