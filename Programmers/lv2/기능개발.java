import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int len = progresses.length;
        int[] day = new int[len];
        
        for(int i=0; i<len; i++){
            int remain = 100-progresses[i];
            int date = remain/speeds[i];
            
            if(remain%speeds[i] != 0){
                date++;
            }
            
            day[i] = date;
        }
       
        List<Integer> list = new LinkedList<>();
        
        System.out.println(Arrays.toString(day));
        int cnt = 0;
        outer : for(int i=0; i<len; i++){
            cnt = 1;
            for(int j=i+1; j<len; j++){
                if(day[i] >= day[j]){
                    cnt++;
                    if(j==len-1){
                        break outer;
                    }
                    
                }else{
                    list.add(cnt);
                    i = j-1;
                    
                    break;
                }
            }
        }
        
       list.add(cnt);
        
        int[] answer = new int[list.size()];
       
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
