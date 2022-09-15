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

//재귀 -> 시간초과

For문 이용

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] nums = new int[n+1];
        
        nums[0] = 0;
        nums[1] = 1;
        
        for(int i=2; i<=n; i++){
            nums[i] = (nums[i-2]+nums[i-1])%1234567;
        }
        
        answer = nums[n];
        
        return answer;
    }
    
   
}
