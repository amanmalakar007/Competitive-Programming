class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(t);
        while (true)
        {
            int pos = s1.indexOf("#");
            if (pos == 0)
                s1.deleteCharAt(pos);
            else if (pos > 0)
                s1.delete(pos-1,pos+1);
            else
                break;
        }
        while (true)
        {
            int pos = s2.indexOf("#");
            if (pos == 0)
                s2.deleteCharAt(pos);
            else if (pos > 0)
                s2.delete(pos-1,pos+1);
            else
                break;
        }
        if(s1.toString().equals(s2.toString()))
            return true;
        return false;
    }
}