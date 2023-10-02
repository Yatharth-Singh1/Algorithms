package stack;
import java.util.*;
public class nextgreaterelemet {

    public static int[] checknext(int arr[]){
        Stack<Integer> s = new Stack();
        s.push(-1);
        int i = arr.length-1;
        int arr2[] = new int[i+1];
        for (i=arr.length-1;i>=0;i--){
        while(!(s.size()==0) && arr[i]>s.peek()){
           
            s.pop();
            
        }
        if (s.size()==0){
            arr2[i] = -1;
        }
        else
            arr2[i] = s.peek();
        
        s.push(arr[i]);
        }
        return arr2;
    }
    
    public static void main(String argss[]){
        int arr[] = {3,7,1,9,0};
        int arr2[] = checknext(arr);
        for (int i =0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
    
}
