class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double temp = (double) n;
        
        if(Math.sqrt(temp) == (int)Math.sqrt(temp)){
            answer = (long) ((Math.sqrt(temp)+1) * (Math.sqrt(temp)+1));
        }else{
            answer = -1;
        }
        
        return answer;
    }
}
