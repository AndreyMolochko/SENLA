package com.company;

import java.util.Arrays;

public class Task4 {
    public static String[] getSortWords(String str){
        String []words = str.split("( |,)");
        Arrays.sort(words);
        return words;
    }
}
