import java.util.*;

class Solution {
    static int N = 0;
    static int R = 3;
    static int ans = 0;
    static int[] sel;
    static int[] num;
    public int solution(int[] number) {
        int answer = 0;
        N = number.length;
        sel = new int[R];
        num = new int[N];
        for(int i=0; i<N; i++){
            num[i] = number[i];
        }
        comb(0, 0);
        answer = ans;
        
        return answer;
    }
    
    public void comb(int idx, int sidx){
        
        if(sidx == R){
          
           int sum = 0;
            for(int x : sel){
                sum+= x;
            }
            
            if(sum == 0){
                ans++;
            }
            
            return;
        }else if(idx == N){
            return;
        }
        sel[sidx] = num[idx];
        comb(idx+1, sidx+1);
        comb(idx+1, sidx);
    }
}
