package com.company;

public class Sortings {
    public static void coutingSort(int []arr,int min,int max){
        int[] count = new int[max - min + 1];
        int z = 0;
        for (int i = 0; i < arr.length; i++){
            count[arr[i] - min]++;
        }
        for (int i = min; i <= max; i++){
            while (count[i - min]-- > 0){
                arr[z] = i;
                z++;
            }
        }
    }

    public static void selectionSort(int[] arr){
        int min, temp;
        int length = arr.length;
        for (int i = 0; i < length - 1; i++){
            min = i;
            for (int j = i + 1; j < length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
