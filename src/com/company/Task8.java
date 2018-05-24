package com.company;

import java.util.ArrayList;

public class Task8 {
    public static ArrayList<Integer>numbersPalindrome(int n){
        ArrayList<Integer>answer=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(Task3.isPalindrome(String.valueOf(i)))answer.add(i);
        }
        return answer;
    }
}
