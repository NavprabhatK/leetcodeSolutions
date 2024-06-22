package org.example.javapractise;

import java.util.Scanner;

public class LongestCommenPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter the size of array");
        int arraySize = scanner.nextInt();*/
        String[] strArr = new String[3];
        for(int i=0; i<3;i++){
            String inputString = scanner.nextLine();
            strArr[i]=inputString;
        }
        String result = longestCommonPrefix(strArr);
        System.out.println("longest prefix is : " + result);
    }
}
