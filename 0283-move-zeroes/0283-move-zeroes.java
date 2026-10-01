class Solution {
    public void moveZeroes(int[] nums) {
      int s=0;
      int f,temp;

      for(f=0;f<nums.length;f++){
        if(nums[f]!=0){
            temp = nums[s];
            nums[s] = nums[f];
            nums[f] = temp;
            s++;
        }
         
      }  
    }
}