package GreedyAlgo;

import java.util.Arrays;

public class absolutedifference {
    public static void main(String args[]){
        int a[] = {2,5,6,9};
        int b[] = {5,1,4,0};

        Arrays.sort(a);
        Arrays.sort(b);

        int absdif = 0;

        for (int i = 0; i < a.length; i++){
            absdif += Math.abs(a[i]-b[i]);
        }
        System.out.println(absdif);
    }
}
