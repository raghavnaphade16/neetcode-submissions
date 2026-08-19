class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap <Character,Integer> hashMap = new HashMap<>();

        int left = 0;
        int max = 0;

        for(int right =0; right < s.length(); right++){
            char ch = s.charAt(right);

            if(hashMap.containsKey(ch) && hashMap.get(ch) >= left){
                left = hashMap.get(ch) + 1;
            }

            hashMap.put(ch, right);
            max = Math.max(max, right - left + 1);
        }
        return max;

    }
}
