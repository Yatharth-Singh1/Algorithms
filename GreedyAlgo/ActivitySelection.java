package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static ArrayList<Integer> activityselect(int start[],int end[]){
        ArrayList<Integer> ar = new ArrayList();
        int currentactivity = 0;
        int activity[][] = new int [start.length][3];
        
        for(int i =0;i<start.length;i++){
            activity [i][0] = i;
            activity [i][1] = start[i];
            activity [i][2] = end[i];

        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        ar.add(activity[0][0]);
        currentactivity = activity[0][2];
            

        for(int i =1;i<start.length;i++){
            
            if (activity[i][1]>=currentactivity){
                ar.add(activity[i][0]);
                currentactivity = activity[i][2];
            }
        }
        return ar;

    }
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        System.out.println(activityselect(start, end));

    }
}
