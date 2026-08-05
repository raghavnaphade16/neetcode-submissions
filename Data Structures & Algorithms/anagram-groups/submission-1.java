class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String,List> hashMap = new HashMap<>();
    for(String s : strs){
        int[]count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : count){
            sb.append(i);
            sb.append('#');
        }
        String key = sb.toString();
        if(!hashMap.containsKey(key)){
            hashMap.put(key,new ArrayList<String>());
        }
        hashMap.get(key).add(s);
    }
    return new ArrayList(hashMap.values());
    }
}
