package org.example;

import java.util.Arrays;

class Reverse {
    public static String reverseChars(String word){
        char[] chars = word.toCharArray();
        char[] revChars=new char[chars.length];
        for (int i=chars.length;i>0;i--){
            revChars[chars.length-i]=chars[i-1];
        }
        return String.valueOf(revChars);
    }
}

public class Main {
    public static void main(String[] args) {
        String word = Reverse.reverseChars("Hello");
        System.out.println(word);

    }
}