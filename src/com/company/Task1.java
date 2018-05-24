package com.company;

public class Task1 {
    public static boolean isEven(int number){
        if(number%2==0)return true;
        else return false;
    }
    public static boolean isSimple(int number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
