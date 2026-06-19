class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];          
        int left = 0, right = -1, maxLen = 0;

        while (true) {                      
            right++;
            if (right >= s.length()) break; 

            char ch = s.charAt(right);
            freq[ch]++;                     

            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            int wSize = right - left + 1;
            if (wSize > maxLen) {
                maxLen = wSize;
            }
        }

        return maxLen;
    }
}