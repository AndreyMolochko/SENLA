package com.company;

public class Task2 {
    public static int addition(int a, int b){
        return a+b;
    }
    public static int difference(int a,int b){
        return a-b;
    }
    public static int gcd(int a, int b){
        while (a!=0 && b!=0){
            if(a>b){
                a%=b;
            }
            else {
                b%=a;
            }
        }
        return a+b;
    }
    public static int lcm (int a, int b){
        return a/gcd(a,b)*b;
    }
}
