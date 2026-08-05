class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> hashMap = new HashMap<>();
       for(int no : nums){
        hashMap.put(no,hashMap.getOrDefault(no,0)+1);
       }
       List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int key: hashMap.keySet()){
            int freq = hashMap.get(key);
            if(bucket[freq] == null){
               bucket[freq] = new ArrayList<>(); 
            }
             bucket[freq].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for(int i=bucket.length - 1; i>=0 && index<k;i-- ){
            if(bucket[i] != null){
                for(int no: bucket[i]){
                    result[index++] = no;
                    if(k == index){
                        break;
                    }
                }
            }
        }
        return result;
    }
}
