class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Map<Integer,Boolean> map = new HashMap<>();
        for(int num: nums){
            map.put(num,true);
        }
        for(int num: nums){
            if(map.containsKey(num - 1)){
                map.put(num,false);
            }
        }
        for(int num: nums){
            if(map.get(num)){
                int count = 1;
                int curr = num;
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
