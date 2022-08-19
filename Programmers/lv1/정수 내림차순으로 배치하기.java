import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] ns = String.valueOf(n).split("");
        Arrays.sort(ns, Collections.reverseOrder());
        String temp = "";
        for(String x : ns){
            temp += x;
        }
        
        answer = Long.parseLong(temp);
        return answer;
    }
}
