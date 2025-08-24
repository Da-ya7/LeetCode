class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int result;
        int total;
        int len = nums.length;
       for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
       }
       total=(len*(len+1))/2;
       result = total - sum;
       return result;
    }
}