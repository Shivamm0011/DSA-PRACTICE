class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0;
        int max = 0;
        int fruit1 = -1;
        int fruit2 = -1;
        int count1 = 0;
        int count2 = 0;
        for (int j = 0; j < fruits.length; j++) {
            if (fruits[j] == fruit1) {
                count1++;
            }
            else if (fruits[j] == fruit2) {
                count2++;
            }
            else {
                while (count1 > 0 && count2 > 0) {
                    if (fruits[i] == fruit1) {
                        count1--;
                    }
                    else {
                        count2--;
                    }
                    i++;
                }
                if (count1 == 0) {
                    fruit1 = fruits[j];
                    count1 = 1;
                }
                else {
                    fruit2 = fruits[j];
                    count2 = 1;
                }
            }
            int length = j - i + 1;
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}