import java.util.Scanner;
public class ElementsofMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Number of elements in the array");
        n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter elements in the array");
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even[] = new int[n/2];
        int odd[] = new int[n/2];
        int j =0,k=0;
         for (int i =0;i<n;i++){
            if (i%2==0){
                even[j]=arr[i];
                j++;
            }
            else{
                even[k]=arr[i];
                k++;
            }
         }
        System.out.println("Even"); 
        for (int i =0;i<n;i++){
            System.out.println(even[i]);
        }
        System.out.println("Odd");
        for (int i =0;i<n;i++){
            System.out.println(odd[i]);
        }
        

    }
}
