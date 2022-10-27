import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n+1];
        arr[1] = true;
        
        for(int i=2; i<arr.length-1; i++){
            for(int j=i*2; j<arr.length; j+=i){
                if(arr[j]){
                    continue;
                }
                
                if(j%i==0){
                    arr[j] = true;
                }
            }
        }
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]){
                continue;
            }
            
            answer++;
        }
        
        return answer;
    }
}
