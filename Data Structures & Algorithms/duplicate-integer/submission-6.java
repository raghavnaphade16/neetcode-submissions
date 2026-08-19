class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
       for(int no: nums){
        if(set.contains(no)){
            return true;
        }
        set.add(no);
       }
            return false;
    }
}
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Set<Integer> hashset = new HashSet<>();
//         for(int num : nums){
//             if(!hashset.add(num)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }