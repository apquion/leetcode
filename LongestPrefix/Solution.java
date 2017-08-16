public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){return "";}
        String longest = "";
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i< strs.length;i++){
            if(strs[i].length() < minLength){minLength = strs[i].length();}
        }
            
        for(int i = 0;  i < minLength ;i++){
            Character c = strs[0].charAt(i);
            for(String myString: strs){
                if (myString.charAt(i) != c){
                    return longest; 
                }
           
            }
            longest += c;
        }
        return longest;

    }
}