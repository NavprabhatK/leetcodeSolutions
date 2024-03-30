package org.example.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the substring");
        String s = scanner.nextLine();
        int length = lengthOfLongestSubstring(s);
        System.out.println("Longest substring length is "+length);
    }
    public static int lengthOfLongestSubstring(String s) {
        int aPointer = 0;
        int bPointer = 0;
        int max = 0;
        Set<Character> uniqueSubString = new HashSet<>();
        while(bPointer<s.length()){
            if(!uniqueSubString.contains(s.charAt(bPointer))){
                uniqueSubString.add(s.charAt(bPointer));
                max = Math.max(uniqueSubString.size(),max);
                bPointer++;
            }else{
                uniqueSubString.remove(s.charAt(aPointer));
                aPointer++;
            }
        }
        return max;
    }
}