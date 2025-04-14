class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder a=new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            a.append((char)(((columnNumber)%26)+'A'));
            columnNumber=(columnNumber)/26;
        }
        return a.reverse().toString();
            }
}