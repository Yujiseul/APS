import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        
        int maxmin = 0;
        //최대
        for(int i = min; i>=0; i--){
            if(max%i == 0 && min % i == 0){
                maxmin = i;
                break;
            }
        }
        
        //최소
        int minmax = 0;
        for(int i= max;i<= max*min ; i++){
            if(i % min == 0 && i% max == 0){
                minmax = i;
                break;
            }
        }
        answer[0] = maxmin;
        answer[1] = minmax;
        return answer;
    }
}
