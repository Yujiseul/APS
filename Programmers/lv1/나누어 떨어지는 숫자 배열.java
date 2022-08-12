import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
       
        
        List<Integer> save = new LinkedList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                save.add(arr[i]);
            }
        }
        if(save.size() == 0){
            save.add(-1);
        }
         int[] answer = new int[save.size()];
        
        for(int i=0; i<save.size(); i++){
            answer[i] = save.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
