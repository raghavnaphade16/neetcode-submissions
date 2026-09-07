class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[120];
        for(int i=0;i < s.length();i++){
            arr[s.charAt(i) - 'A']++;
            arr[t.charAt(i) - 'A']--;
        }
        for(int i : arr){
            if(i!= 0){
                return false;
            }
        }
        return true;
    }
}
