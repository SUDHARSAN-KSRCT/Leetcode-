class Solution {
    public boolean canJump(int[] nums) {
        int Jumpgame=0;
        for(int i=0;i<nums.length;i++){
            if (i>Jumpgame){
                return false;
            }
            Jumpgame=Math.max(Jumpgame,i+nums[i]);
        }
        return true;
    }

}