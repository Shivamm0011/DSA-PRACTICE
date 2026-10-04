class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int lmax = 0;
        int rmax = 0;
        int water = 0;
        while (i < j) {
            if (height[i] <= height[j]) {
                if (height[i] > lmax) {
                    lmax = height[i];
                } else {
                    water += lmax - height[i];
                }
                i++;
            }
            else {
                if (height[j] > rmax) {
                    rmax = height[j];
                } else {
                    water += rmax - height[j];
                }
                j--;
            }
        }
        return water;
    }
}