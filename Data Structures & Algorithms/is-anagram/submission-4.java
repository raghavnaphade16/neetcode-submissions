class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i=0; i< s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i: count){
            if(i != 0){
                return false;
            }
        }
        return true;
        // if(s.length() != t.length()){
        //     return false;
        // }
        // int[] count = new int[26];
        // for(int i=0; i<s.length();i++){
        //     count[s.charAt(i) - 'a']++;
        //     count[t.charAt(i) - 'a']--;
        // }
        // for(int i: count){
        //     if(i != 0){
        //         return false;
        //     }
        // }
        // return true;

    //    if(s.length() != t.length()) {
    //     return false;
    //    }
    //    int[] count = new int[26];

    //    for(int i =0 ; i< s.length();i++){
    //     count[s.charAt(i) - 'a']++;
    //     count[t.charAt(i) - 'a']--;
    //    }
    //    for(int i: count ){
    //     if( i != 0){
    //         return false;
    //     }
    //    }
    //    return true;


    //     HashMap <Character,Integer> hash = new HashMap<>();
    //     boolean isPresent = true;
    //     if(s.length() != t.length()) {
    //         return false;
    //     }
    //     for(char ch : s.toCharArray()){
    //         System.out.println(ch);
    //         if(hash.containsKey(ch)){
    //             int no = hash.get(ch);
    //             hash.put(ch,++no);
    //         }else{
    //              hash.put(ch,1);
    //         }
    //     }
    //      for(char ch : t.toCharArray()){
    //         //   System.out.println(ch);
    //         if(hash.containsKey(ch)){
    //             int no = hash.get(ch);
    //           no = no - 1;
    //             if(no < 0){
    //                 isPresent = false;
    //                 break;
    //             }
    //             hash.put(ch,no);
    //         }else{
    //            isPresent = false;
    //            break;
    //         }
    //      }
    //  return isPresent;
    }
}
