class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse=0;
        int temp=Math.abs(x);
        while(temp!=0){
                reverse=reverse*10+(temp%10);
                temp=temp/10;
        }
        return (reverse==Math.abs(x));
    }
}