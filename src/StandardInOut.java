public class StandardInOut {


    public String reverseWords(String input) {
        String[] words = input.split("\s+");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                reverseString.append(words[i]);
            } else {
                reverseString.append(words[i]).append(" ");
            }
        }
        System.out.println(reverseString);
        return reverseString.toString();
    }
}
