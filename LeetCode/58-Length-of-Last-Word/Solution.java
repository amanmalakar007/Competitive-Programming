class Solution {
    public static void main(String args[]) {
        String s = " ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int pos = -1;
        s = s.trim(); //remove all leading or trailing spaces
        pos = s.lastIndexOf(" "); //find the index of the last whitespace character if it exists
        if (s == "")
            return 0; //return 0 if input string is empty
        else if (pos == -1)
            return s.length(); //return the length of the string itself if string contains only one word
        return (s.length() - pos - 1); //else calculate the length of the last word and return it
    }
}