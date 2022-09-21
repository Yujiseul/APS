# split 사용 시 효율성 통과 x
# charAt으로 변경

import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

       Stack<Character> st = new Stack<>();
        
        
        for(int i=0; i<s.length(); i++){
            
            char n = s.charAt(i);
            if(n == '('){
                st.push(n);
            }else{
                
                if(st.isEmpty()){
                    answer = false;
                    break;
                }
                 st.pop();
            }
        }
        
        if(!st.isEmpty()){
            answer = false;
        }


        return answer;
    }
}
