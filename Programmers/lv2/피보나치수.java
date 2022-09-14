class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = fibo(n);
        answer = num % 1234567;
        return answer;
    }
    
    public int fibo(int n){
        
        if(n == 0){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }
        
        return fibo(n-1) + fibo(n-2);
    }
}

//시간초과

For문 이용
