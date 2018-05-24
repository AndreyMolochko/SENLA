package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boolean flag=true;
        while(flag){
            System.out.println("Enter value. Value is number of task. If you want to go out you should enter -1");
            Scanner sc = new Scanner(System.in);
            int numberOfTask=0;
            try {
                numberOfTask = sc.nextInt();
                if(numberOfTask!=-1)System.out.println("You chose task number "+numberOfTask);
            } catch (Exception e) {
                System.out.println("You entered incorrect data");
            }
            switch(numberOfTask){
                case 1:
                    System.out.println("You should enter an integer");
                    int number = 0;
                    try {
                        number = sc.nextInt();
                        if(Task1.isEven(number)) System.out.println("Number "+ number +" is even");
                        else System.out.println("Number "+ number +" is odd");
                        if(Task1.isSimple(number)) System.out.println("Number "+ number +" is simple number");
                        else System.out.println("Number "+ number +" is composite number");
                    } catch (Exception e) {
                        System.out.println("You entered incorrect data");
                    }
                    break;
                case 2:
                    System.out.println("You should enter two numbers");
                    try {
                        int firstNumber = sc.nextInt();
                        int secondNumber=sc.nextInt();
                        if(firstNumber<1 || secondNumber<1) System.out.println("Enter natural numbers");
                        else {
                            System.out.println("Your numbers are " + firstNumber + " and " + secondNumber);
                            System.out.println("a + b = " + Task2.addition(firstNumber, secondNumber));
                            System.out.println("a - b = " + Task2.difference(firstNumber, secondNumber));
                            System.out.println("Greatest common divisor of a and b = " + Task2.gcd(firstNumber, secondNumber));
                            System.out.println("Least common multiple of a and b = " + Task2.lcm(firstNumber, secondNumber));
                        }
                    } catch (Exception e) {
                        System.out.println("You entered incorrect data");
                    }
                    break;
                case 3:
                    Scanner s = new Scanner(System.in);
                    System.out.println("You should enter string");
                    String str=s.nextLine();
                    if(Task3.isPalindrome(str)) System.out.println(str+" is palindrome");
                    else System.out.println(str+" isn't palindrome");
                    break;
                case 4:
                    //lexicographical sorting
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the sentense");
                    String sentense = scanner.nextLine();
                    String []words = Task4.getSortWords(sentense);
                    int counterNull=0;
                    for(int i=0;i<words.length;i++){
                        if(words[i].length()>0)System.out.println(words[i]);
                        else counterNull++;
                    }
                    System.out.println("Number of words = "+(words.length-counterNull));
                    break;
                case 5:
                    Scanner st = new Scanner(System.in);
                    System.out.println("Enter text");
                    String text = st.nextLine();
                    System.out.println("Enter word");
                    String word = st.nextLine();
                    System.out.println("Answer = "+Task5.counterWord(text,word));
                    break;
                case 6:
                    System.out.println("You should enter three sides");
                    try {
                        double sideA = sc.nextInt();
                        double sideB = sc.nextInt();
                        double sideC = sc.nextInt();
                        System.out.println("The first side  = "+sideA);
                        System.out.println("The second side  = "+sideB);
                        System.out.println("The third side  = "+sideC);
                        if(Task6.isSegmentsTriangle(sideA,sideB,sideC)) System.out.println("You can build a right triangle");
                        else System.out.println("You can't build a right triangle");
                    } catch (Exception e) {
                        System.out.println("You entered incorrect data");
                    }
                    break;
                case 7:
                    System.out.println("Enter array size ");
                    try {
                        int size = sc.nextInt();
                        int [] array=new int[size];
                        for(int i=0;i<array.length;i++){
                            array[i]=10+(int)(Math.random()*90);
                        }
                        System.out.print("All elements : ");
                        for(int i : array){
                            System.out.print(i+" ");
                        }
                        System.out.println("\n Max = "+Task7.max(array));
                        System.out.println(" Min = "+Task7.min(array));
                    } catch (Exception e) {
                        System.out.println("You entered incorrect data");
                    }
                    break;
                case 8:
                    System.out.println("Enter N not more 100");
                    try {
                        byte N = sc.nextByte();
                        if(N>99 || N<=0 ) System.out.println("Incorrect data");
                        else {
                            ArrayList<Integer> numbersPalindrome = Task8.numbersPalindrome(N);
                            for (int i : numbersPalindrome) {
                                System.out.print(i + " ");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("You entered incorrect data");
                    }
                    break;
                case 9:
                    System.out.println("Enter N");
                    try {
                        int n = sc.nextInt();
                        ArrayList<Integer>arrayList=Task9.getEvenNumbers(n);
                        for (int i:arrayList) {
                            System.out.print(i+" ");
                        }
                        System.out.println("sum = "+Task9.sum(arrayList));
                    } catch (Exception e) {
                        System.out.println("You entered incorrect data");
                    }
                    break;
                case 10:
                    System.out.println("Enter 3 digits");
                    try {
                        int firstDigit=sc.nextInt();
                        int secondDigit=sc.nextInt();
                        int thirdDigit=sc.nextInt();
                        ArrayList<Integer> numbers=Task10.getNumbers(firstDigit,secondDigit,thirdDigit);
                        if(numbers.size()>0){
                            for (int i:numbers) {
                                System.out.print(i+" ");
                            }
                        }
                        else System.out.println("Numbers are absent");
                    } catch (Exception e) {
                        System.out.println("You entered incorrect data");
                    }
                    break;
                case -1: flag=false;
                break;
            }
        }
    }
}
