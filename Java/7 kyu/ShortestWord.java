/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
*/

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");        
        String menor = words[0];
        for (String word : words) {
            if (word.length() < menor.length()) {
                menor = word;
            }
        }
        return menor.length();
    }
}