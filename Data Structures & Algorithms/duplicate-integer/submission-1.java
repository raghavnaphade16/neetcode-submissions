class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
        // HashMap <Integer,Integer> hashMap = new HashMap<>();
        // boolean isDuplicate = false;
        // for(int no : nums){
        //     if(hashMap.containsKey(no)){
        //         isDuplicate = true;
        //     } else {
        //         hashMap.put(no,no);
        //     }
        // }
        // return isDuplicate;
    }
}