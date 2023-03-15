package org.example;

import java.util.Arrays;
import java.util.Scanner;

class Reverse {
    public static String reverseChars(String word) {
        char[] chars = word.toCharArray();
        char[] revChars = new char[chars.length];
        for (int i = chars.length; i > 0; i--) {
            revChars[chars.length - i] = chars[i - 1];
        }
        return String.valueOf(revChars);
    }

    public static String reverseWords(String word) {
        String[] words = word.split(" ");
        String[] revWords = new String[words.length];
        for (int i = words.length; i > 0; i--) {
            revWords[words.length - i] = words[i - 1];
        }

        return Arrays.toString(revWords)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String revChar = Reverse.reverseChars(s);
        String revWord = Reverse.reverseWords(s);

        System.out.println("Reversing Char: " + revChar);
        System.out.println("Reversing Words: " + revWord);
    }
}