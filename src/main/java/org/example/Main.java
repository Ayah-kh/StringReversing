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

    public static String reverseWords(String word) {
        String[] words = word.split(" ");
        String[] revWords=new String[words.length];
        for (int i=words.length;i>0;i--){
            revWords[words.length-i]=words[i-1];
        }
        String string = revWords.join();
        return string;
    }
}

public class Main {
    public static void main(String[] args) {
        String revChar = Reverse.reverseChars("Hello world");
        String revWord = Reverse.reverseWords("Hello world");
        System.out.println(revChar);
        System.out.println(revWord);

    }
}