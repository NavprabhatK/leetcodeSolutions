package org.example.leercodepractise;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> characterStack = new Stack<>();
        for(char c: s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                characterStack.push(c);
            }else if (c==')' && !characterStack.isEmpty() && characterStack.peek() == '('){
                characterStack.pop();
            }else if (c=='}' && !characterStack.isEmpty() && characterStack.peek() == '{'){
                characterStack.pop();
            }else if (c==']' && !characterStack.isEmpty() && characterStack.peek() == '['){
                characterStack.pop();
            }else {
                return false;
            }
        }

        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input  = scanner.nextLine();
        boolean result = isValid(input);
        System.out.println("Is Valid Parenthesis : " + result);
    }
}
