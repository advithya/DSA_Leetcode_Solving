class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        String Word[]=str.split(" ");
        String LastWord=Word[Word.length-1];
        int length = LastWord.length();
        return length;
    }
}