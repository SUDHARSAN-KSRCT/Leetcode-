class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String m=s+s;
        String sudhan=m.substring(1,m.length()-1);
        return sudhan.contains(s);
    }
}