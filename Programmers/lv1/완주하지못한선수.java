import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        
        String answer = "";
        boolean flag = false;
        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                flag = true;
                
                break;
            }
           if(i == completion.length-1 && !flag){
           
            answer = participant[participant.length-1];
        } 
            
        }
        
        
        
        return answer;
    }
}
