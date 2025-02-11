public class ReverseWords {
    public static void main(String[] args) {
        String s1 = "Today is Holiday";

        String[] words = s1.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println("Output: " + reversed.toString());
    }
}