import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
   
        s = s.toLowerCase();
       int idx = 0;
        for(int i=0; i<s.length(); i++){
            idx++;
            char a = s.charAt(i);
            
            if(a == ' ') {
                idx = 0;
            }else if(idx == 1){
                if(a < '0' || a> '9'){
                     a -= 32;
                }
            }
            
            answer += String.valueOf(a);
        } 
        
        return answer;
    }
}


