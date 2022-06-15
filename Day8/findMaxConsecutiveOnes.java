class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int total=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            total=Math.max(count,total);
        }
        return total;
    }
}
