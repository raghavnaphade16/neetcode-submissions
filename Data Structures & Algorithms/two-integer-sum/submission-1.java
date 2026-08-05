class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums.length; i++){
            int diff = target - nums[i];
            if(hashMap.containsKey(diff)){
                return new int[]{hashMap.get(diff),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{};


        // int[] ans = new int [2];
        // System.out.println(nums.length);
        // for(int i=0;i< nums.length;i++){
        //     for(int j=i+1; j < nums.length;j++ ){
        //         if (i == j){
        //             continue;
        //         }
        //         if(nums[i] + nums[j] == target){
        //         ans[0] = i;
        //         ans[1] = j;
        //         break;
        //     }
        //     }
        // }
        // System.out.println(Arrays.toString(ans));
        // return ans;

    }
}
