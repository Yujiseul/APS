import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        long sum1 = 0;
        long sum2 = 0;
        for(int x : queue1){
            sum1 += x;
        }
        for(int x : queue2){
            sum2 += x;
        }
        
        long goal = (sum1+sum2)/2; // 두 큐가 맞춰야할 수
        
        if(sum1 == goal) {
            answer = 0;
        }else if(sum1 > goal){
            int out = queue1.poll();
            queue2.add(out);
            sum1 -= out;
        }else{
            int out = queue2.poll();
            queue1.add(out);
            sum1 += out;
        }
        
        return answer;
    }
}
