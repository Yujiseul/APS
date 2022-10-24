class Solution {
    static long ans = 0;
    public long solution(int n) {
        long answer = 0;
        
        recursion(0,n);
        
        answer = ans%1234567;
        
        return answer;
    }
    
    static void recursion(int s, int n){
        if(s>n){
            return;
        }else if(s == n){
            ans++;
        }
        
        recursion(s+1, n);
        recursion(s+2, n);
    }
}

// 시간초과나는 케이스 존재 
