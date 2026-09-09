// class Solution {
//     public int characterReplacement(String s, int k) {
//        int[] freq = new int[26];
//        int maxWin = 0;
//        int maxFreq = 0;
//        int left = 0;
//        for(int right = 0; right < s.length();right++){
//         freq[s.charAt(right) - 'A']++;
//         maxFreq = Math.max(maxFreq,freq[s.charAt(right) - 'A']);
//         int winLen = right - left + 1;
//         if(winLen - maxFreq > k){
//               freq[s.charAt(left) - 'A']--;
//               left++;
//         }
//         winLen = right - left + 1;
//         maxWin = Math.max(maxWin,winLen);
//        }
//        return maxWin;
//     }
// }

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left =0;
        int maxFreq = 0;
        int maxChar = 0;
        for(int right = 0; right < s.length();right++){
            freq[s.charAt(right)- 'A']++;
            int windowLength = right - left + 1;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right)- 'A']);
            if(windowLength - maxFreq  > k){
                 freq[s.charAt(left)- 'A']--;
                 left++;
            }
           windowLength = right - left + 1;
        maxChar = Math.max(maxChar,windowLength);
        }
        return maxChar;
    }
}
