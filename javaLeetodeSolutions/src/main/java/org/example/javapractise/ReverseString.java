package org.example.javapractise;

import java.util.Scanner;

public class ReverseString {

    public static void stringReverse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :");
        String input = scanner.nextLine();

        //Using String Builder
        StringBuilder stringBuilder = new StringBuilder(input);
        System.out.println(stringBuilder.reverse());

        //Using iteration
        char[] charArr = input.toCharArray();
        StringBuilder outputStr = new StringBuilder();
        for(int i = charArr.length - 1; i>=0; i--){
            outputStr.append(charArr[i]);
        }
        System.out.println(outputStr);

        //using recursive method;
        String outputStr2 = recursiveMethod(input);
        System.out.println(outputStr2);

        scanner.close();
    }

    public static  String recursiveMethod(String str){
        if(str == null || str.length()<=1) {
            return str;
        }
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        stringReverse();
    }
}
