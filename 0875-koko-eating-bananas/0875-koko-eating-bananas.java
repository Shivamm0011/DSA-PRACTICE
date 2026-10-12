class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = 0;
        for (int x: piles) {
            if (x> j) {
                j= x;
            }
        }
        int ans= j;
        while (i<= j) {
            int mid = i+ (j- i) / 2;
            long hours= 0;
            for (int x: piles) {
                hours+= (x + (long) mid - 1) / mid;
            }
            if (hours<= h) {
                ans= mid;
                j= mid - 1;
            } else {
                i= mid + 1;
            }
        }
        return ans;
    }
}