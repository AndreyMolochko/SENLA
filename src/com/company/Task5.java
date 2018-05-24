package com.company;

public class Task5 {
    public static int counterWord(String text, String word){
        text=text.toLowerCase();
        word=word.toLowerCase();
        String []words=text.split(" ");
        int counter=0;

        for(int i=0;i<words.length;i++){
            if(word.equals(words[i]))counter++;
        }
        return counter;
    }
}
