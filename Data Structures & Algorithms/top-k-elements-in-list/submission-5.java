class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1); 
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            if(bucket[count] == null){
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(num);
        }
        int[] result = new int[k];
        int index = 0;
        for(int i = bucket.length - 1 ; i >=0 && index < k;i--){
            if(bucket[i] != null){
                for(int num: bucket[i]){
                    result[index++] = num;
                    if(index == k){
                        break;
                    }
                }
            }
        }
        return result;
    }
}
