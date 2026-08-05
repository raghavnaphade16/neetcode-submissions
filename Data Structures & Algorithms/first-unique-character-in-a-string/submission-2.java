class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 1){
            return 0;
        }
        int[] count = new int[26];
      for(char c: s.toCharArray()){
            count[c - 'a']++;
        }
        for(int i = 0;i< s.length();i++){
            if(count[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}