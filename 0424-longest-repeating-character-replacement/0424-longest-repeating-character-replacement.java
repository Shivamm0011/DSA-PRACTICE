class Solution {
    public int characterReplacement(String s, int k){
        int i = 0;
        int max = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        for (int j = 0; j < s.length(); j++) {
            int index = s.charAt(j) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
            int length = j - i + 1;
            int changes = length - maxFreq;
            while (changes > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
                length = j - i + 1;
                changes = length - maxFreq;
            }
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}