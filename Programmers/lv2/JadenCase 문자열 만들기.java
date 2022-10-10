import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
   
        s = s.toLowerCase();
       int idx = 0;
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            
            if(a == ' ') {
                idx = 0;
            }
            
            answer += String.valueOf(a);
        } 
        
       
            
       
        
        
        
        return answer;
    }
}
