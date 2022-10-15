class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i=1; i<n; i++){
            int sum = i;
            int idx = i;
            while(sum < n){
                if(idx== n-1){
                    break;
                }
                    sum += ++idx;
            }
            if(sum == n){
                answer++;
            }
        }
        return answer;
    }
}


// 배열 만들어서 풀면 효율성 
