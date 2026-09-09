// class Solution {
//     public String minWindow(String s, String t) {
        
//         int[] mapS = new int[256]; 
//         int[] mapT = new int[256]; 
 
//         for (char ch : t.toCharArray()) { 
//             mapT[ch]++; 
//         } 
        
//         int right = 0; 
//         int minLen = Integer.MAX_VALUE; 
//         int minStart = 0;
//         int left = 0;
//         for(; right < s.length();right++){
//             mapS[s.charAt(right)]++; 
//             while(contains(mapS,mapT)){
//                 int windowLen = right - left + 1;
//                 if(windowLen <minLen){
//                     minLen = right - left + 1;
//                     minStart = left;
//                 }
//                 mapS[s.charAt(left++)]--;
//             }
//         }
//         return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart + minLen);
//     }
//   private boolean contains(int[] mapS, int[] mapT) { 
 
//         for (int i = 0; i < mapT.length; i++) { 
 
//             if (mapT[i] > mapS[i]) { 
//                 return false; 
//             } 
//         } 
 
//         return true; 
//     } 
// }

class Solution {
    public String minWindow(String s, String t) {
        int[] mapT = new int[256];
        int[] mapS = new int[256];
        for(char c: t.toCharArray()){
            mapT[c]++;
        }
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        for(; right < s.length();right++){
            mapS[s.charAt(right)]++;
            while(contains(mapS,mapT)){
               int windlowLength = right - left + 1;
               if(windlowLength < minLen){
                minLen = windlowLength;
                minStart = left;
               }
               mapS[s.charAt(left++)]--;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);

    }
    public boolean contains(int[] mapS,int[] mapT){
        for(int i =0; i< mapT.length;i++){
            if(mapT[i] > mapS[i]){
                return false;
            }
        }
        return true;
    }


}

