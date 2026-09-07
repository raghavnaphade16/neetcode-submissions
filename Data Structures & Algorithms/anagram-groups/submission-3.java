class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] count = new int[126];
            StringBuilder sb = new StringBuilder(); 
            for(int i =0;i< s.length();i++){
                count[s.charAt(i) - 'A']++;
            }
            for(int i: count){
                sb.append(i);
                sb.append('#');
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
