import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String nn = Long.toString(n);
        String[] nnn = nn.split("");
        
        
        
        int idx = nnn.length-1;     
        int[] answer = new int[nnn.length];
        for(String x : nnn){
           answer[idx--] = Integer.valueOf(x);
       }
        return answer;
    }
}
