package com.company;

public class Task6 {
    public static boolean isSegmentsTriangle(double a, double b, double c){
        if(Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2)||
                Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2)||
                Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2))return true;
        else return false;
    }
}
