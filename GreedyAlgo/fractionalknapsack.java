package GreedyAlgo;

import java.util.*;

public class fractionalknapsack {
    public static void main(String args[]){
        int value[] = {60,100,120};
        int weight[] ={10,20,30};
        int maxcap = 50;
        double ratio [][] = new double [value.length][2];
        for (int i =0;i<=value.length-1;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int capacity = maxcap;
        int valuefal = 0;
         for (int i = ratio.length-1;i>=0;i--){
            int ind = (int)ratio[i][0];
            if (capacity>=weight[ind]){
                valuefal += value[ind];
                capacity -= weight[ind];
            }
            else{
                valuefal += (int) ratio[i][1]*(capacity);
                capacity=0;
                break;
            }
         }
         System.out.println("Value is "+valuefal);
    }
}
