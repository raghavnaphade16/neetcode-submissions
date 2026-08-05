class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer,Integer> hashMap = new HashMap<>();
        boolean isDuplicate = false;
        for(int no : nums){
            if(hashMap.containsKey(no)){
                isDuplicate = true;
            } else {
                hashMap.put(no,no);
            }
        }
        return isDuplicate;
    }
}