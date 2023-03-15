package org.example;

class Reverse {
    public static void reverseChars(String word){
        char[] chars = word.toCharArray();
        for (int i=chars.length;i>0;i--){
            System.out.print(chars[i-1]);
        }
//        return word;
    }
}

public class Main {
    public static void main(String[] args) {
        Reverse.reverseChars("Hello");

    }
}