public class Solution {
    public int lengthOfLastWord(String s) {
       
        String[] words = s.trim().split(" ");
        
      
        return words.length == 0 ? 0 : words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s = "Hello World";
        System.out.println(solution.lengthOfLastWord(s)); 
    }
}