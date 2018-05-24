package com.company;

public class Task7 {
    public static int max(int []a){
        int max=a[0];
        for(int i : a){
            if(i>max)max=i;
        }
        return max;
    }

    public static int min(int []a){
        int min=a[0];
        for(int i : a){
            if(i<min)min=i;
        }
        return min;
    }
}
