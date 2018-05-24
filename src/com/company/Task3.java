package com.company;

public class Task3 {
    public static boolean isPalindrome(String str){
        if(str.equals(new StringBuilder(str).reverse().toString()))return true;
        else return false;
    }
}
