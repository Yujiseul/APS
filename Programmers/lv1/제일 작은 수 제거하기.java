import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer ={};
        
        if(arr.length == 1){
            answer = new int[] {-1};
        }
        else{
            answer = new int[arr.length-1];
            int[] temp = arr.clone();
            
            Arrays.sort(temp);
            int min = temp[0];
            int idx = 0;
            for(int i : arr){
                System.out.println(i);
                if(i == min){
                    continue;
                }
               
                answer[idx++] = i;
            }
        }
        
        return answer;
    }
}
