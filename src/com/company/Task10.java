package com.company;

import java.util.ArrayList;

public class Task10 {
    public static ArrayList<Integer> getNumbers(int a,int b,int c){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=100;i<=999;i++){
            if(i%10==a || i%10==b ||i%10==c){
                if (i/10%10==a || i/10%10==b ||i/10%10==c){
                    if(i/100==a || i/100==b ||i/100==c){
                        answer.add(i);
                    }
                }
                else continue;
            }
            else continue;
        }
        return answer;
    }
}
