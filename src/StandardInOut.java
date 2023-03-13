import java.util.Arrays;

public class StandardInOut {


    public String reverseWords(String input) {
        String[] words = input.split("\s+");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0) {
                reverseString.append(words[i]);
            } else {
                reverseString.append(words[i]).append(" ");
            }
        }
        System.out.println(reverseString);
        return reverseString.toString();
    }

    public String reverseWordsCharacters(String input) {

        String[] split = reverseWords(input).split("\s+");
        StringBuilder reverseString = new StringBuilder();

        for (String word : split) {
            char[] wordToChar = word.toCharArray();
            char[] result = new char[word.length()];
            for (int i = wordToChar.length - 1; i >= 0; i--) {
                result[wordToChar.length - i - 1] = wordToChar[i];
            }
            reverseString.append(result).append(" ");
        }
        return reverseString.toString().trim();

    }

    public String reverseWordsAndCharactersShort(String input) {
        StringBuilder sb = new StringBuilder(input.replaceAll("\\s+", " "));
        return sb.reverse().toString();
    }
}