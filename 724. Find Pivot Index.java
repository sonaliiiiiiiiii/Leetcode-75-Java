class Solution {
    public int pivotIndex(int[] nums) {
        int leftmost=0;
        int rightmost=0;
        int total =0;

        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
        }

        for(int j=0;j<nums.length;j++){
            rightmost=total-leftmost-nums[j];
            if(rightmost==leftmost){
                return j;
            }
            leftmost=leftmost+nums[j];
        }
        return -1;
    }
}