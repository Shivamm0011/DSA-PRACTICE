class Solution {
    public int[] sortedSquares(int[] nums) {
    int i,j,k;
    i=0;
    j=nums.length - 1;
    int[] result = new int[nums.length];
    for(k=nums.length -1; k>=0;k--){
        if(Math.abs(nums[i])>Math.abs(nums[j])){
         result[k]= nums[i]*nums[i];
         i++;
        }
        else{
            result[k]= nums[j]*nums[j];
            j--;
           }
        }
    
       return result;
    }
}   
