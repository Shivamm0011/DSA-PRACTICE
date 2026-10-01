class Solution {
    public int[] twoSum(int[] nums, int target) {
    int i,j;
    i=0;
    j=nums.length -1;
    for(; i<j; ){
        int sum = nums[i] + nums[j];
     if (sum==target){
        return new int[]{i+1,j+1};}
     if (sum < target){
      i++;}
     if (sum> target){
      j--;}

     
     
    }
        
    return new int[]{-1,-1};}
}