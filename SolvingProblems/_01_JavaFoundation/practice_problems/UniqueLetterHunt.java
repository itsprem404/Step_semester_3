package _01_JavaFoundation.practice_problems;//import java.util.*;
//
//public class Week1.UniqueLetterHunt {
//
//
//    static char findFirstNonRepeatingChar(String text) {
//
//
//        // Step 1: Store character frequencies
//        HashMap<Character, Integer> frequency = new HashMap<>();
//
//
//        for (char ch : text.toCharArray()) {
//
//            frequency.put(
//                    ch,
//                    frequency.getOrDefault(ch, 0) + 1
//            );
//        }
//
//
//
//        // Step 2: Find first character with count 1
//        for (char ch : text.toCharArray()) {
//
//            if (frequency.get(ch) == 1) {
//                return ch;
//            }
//        }
//
//
//        // No non-repeating character found
//        return '\0';
//    }
//
//
//
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.print("Enter text: ");
//        String text = sc.nextLine();
//
//
//
//        char result = findFirstNonRepeatingChar(text);
//
//
//
//        if (result == '\0') {
//
//            System.out.println(
//                    "No Non-Repeating Character Found"
//            );
//
//        }
//        else {
//
//            System.out.println(
//                    "First Non-Repeating Character: '"
//                            + result + "'"
//            );
//        }
//
//
//        sc.close();
//    }
//}

import java.util.*;

public class UniqueLetterHunt {


    static char findFirstNonRepeatingChar(String text) {


        // Array to store character frequency
        int[] frequency = new int[256];


        // Step 1: Count frequency of each character
        for (char ch : text.toCharArray()) {

            frequency[ch]++;
        }



        // Step 2: Find first character with frequency 1
        for (char ch : text.toCharArray()) {

            if (frequency[ch] == 1) {
                return ch;
            }
        }


        // No unique character found
        return '\0';
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter text: ");
        String text = sc.nextLine();



        char result = findFirstNonRepeatingChar(text);



        if (result == '\0') {

            System.out.println(
                    "No Non-Repeating Character Found"
            );

        }
        else {

            System.out.println(
                    "First Non-Repeating Character: '"
                            + result + "'"
            );
        }


        sc.close();
    }
}