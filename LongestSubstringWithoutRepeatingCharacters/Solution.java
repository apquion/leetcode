public class Solution {
    public int lengthOfLongestSubstring(String s) {
  
        String upperS = s.toUpperCase();
        String sub = "";
        
//         Hashtable<Integer,String> results = new         
//         Hashtable<Integer,String>();
        
        
        String longest = "";
        int max = 0;
            
        for (int i = 0; i < s.length(); i++){

            int[] dict = new int[150];
            for (int j = i; j < s.length(); j++){
                char c = s.charAt(j);
                int ascii = (int) c;
                if(dict[ascii] > 0){
                    break;
                }
                else{
                    dict[ascii] += 1;
                    sub += c;
                }
            }
            if( sub.length() > max){
                max = sub.length();
                longest = sub;
            }
            sub = ""; // reset the substring and go again
        }
        
        // go through 
        return max;
    }
}