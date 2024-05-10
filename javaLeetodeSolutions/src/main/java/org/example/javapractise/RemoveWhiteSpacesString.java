package org.example.javapractise;

import java.util.Scanner;

public class RemoveWhiteSpacesString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.nextLine();

        //Using replaceAll Method
        String replacedString = input.replaceAll("\\s+","");
        System.out.println("String without white space is : "+replacedString);

        //using iteration (which is for interview)
        char[] charArr = input.toCharArray();
        StringBuilder replacedString2 = new StringBuilder();
        for (char c : charArr) {
            if (c != ' ' && c != '\t') {
                replacedString2.append(c);
            }
        }
        System.out.println("String without white space another way is : "+replacedString2);
    }
}
