class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int num: nums){
            map.put(num,true);
        }
        for(int num: nums){
            if(map.containsKey(num-1)){
                map.put(num,false);
            }
        }
        int longest = 0;
        for(int num:nums){
            if(map.get(num)){
                int curr = num;
                int count = 1;
                while(map.containsKey(curr + 1)){
                    curr++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
