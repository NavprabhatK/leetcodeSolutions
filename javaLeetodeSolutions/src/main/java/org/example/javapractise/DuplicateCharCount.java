package org.example.javapractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharCount {

    //Write a Java program to find duplicate characters and their count in a given string.
    // For example, in a string “Better Butter”, duplicate characters and their count is
    // t : 4, e : 3, r : 2 and B : 2

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.nextLine();

        //My Solution
        duplicateCharSol1(input);

        // Solution in the reference doc
        duplicateCharSol2(input);

        scanner.close();

    }

    private static void duplicateCharSol2(String input) {
        Map<Character, Integer> duplicateCountMap = new HashMap<>();
        char[] charArr = input.toCharArray();
        for(char c: charArr){
           /* if(duplicateCountMap.containsKey(c)){
                duplicateCountMap.put(c, duplicateCountMap.get(c)+1);
            }else{
                duplicateCountMap.put(c, 1);
            }*/

            duplicateCountMap.put(c,duplicateCountMap.getOrDefault(c,0)+1);
        }
        Set<Character> charSet = duplicateCountMap.keySet();
        System.out.println("Duplicate characters based on solution 2 : ");
        for(char c: charSet){
            if(duplicateCountMap.get(c)>1){
                System.out.println(c + " : " + duplicateCountMap.get(c));
            }
        }

        if(duplicateCountMap.isEmpty() || duplicateCountMap.entrySet().stream().noneMatch(entry -> entry.getValue()>1)){
            System.out.println("There are no duplicates");
        }
    }

    private static void duplicateCharSol1(String input) {
        char[] charArr = input.toCharArray();
        Map<Character, Integer> matchDetailsMap = new HashMap<>();
        for (char value : charArr) {
            int matchcount = 0;
            for (char c : charArr) {
                if (value == c) {
                    matchcount++;
                    if(matchcount>1) {
                        matchDetailsMap.put(value, matchcount);
                    }
                }
            }
        }

        if(matchDetailsMap.isEmpty()){
            System.out.println("There are no duplicates");
        }else{
            System.out.println("Duplicate Characters are: ");
            for(Map.Entry<Character, Integer> entry :matchDetailsMap.entrySet()){
                System.out.println(entry.getKey() +" : "+entry.getValue());
            }
        }
    }
}
