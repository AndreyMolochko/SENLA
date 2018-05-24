package com.company;

import java.util.ArrayList;

public class Task9 {
    public static ArrayList<Integer> getEvenNumbers(int n){
        ArrayList<Integer> arrayEven = new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(i%2==0)arrayEven.add(i);
        }
        return arrayEven;
    }

    public static int sum (ArrayList<Integer>arr){
        int answer=0;
        for(int i=0;i<arr.size();i++){
            answer+=arr.get(i);
        }
        return answer;
    }
}
