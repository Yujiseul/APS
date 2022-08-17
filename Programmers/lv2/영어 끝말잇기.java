import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[] {0, 0};
        
        // 단어가 중복되는지 확인
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<words.length-1; i++){
            map.put(words[i], map.getOrDefault(words[i],0)+1);
           
            
            String end = words[i].substring(words[i].length()-1,words[i].length());
            String start = words[i+1].substring(0, 1);
            
            
            // 중복일 떄
            if(map.get(words[i]) != 1){
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                
                break;
            }
            // 마지막에서 중복 발생 할 때
            if(i == words.length-2){
                 map.put(words[i+1], map.getOrDefault(words[i+1],0)+1);
                if(map.get(words[words.length-1]) != 1){
                    answer[0] = ((i+1)%n)+1;
                    answer[1] = ((i+1)/n)+1;
                }
            }
        
            //  끝말잇기 실패할 떄
             if(! end.equals(start)){
                answer[0] = ((i+1)%n)+1;
                answer[1] = ((i+1)/n)+1;
              
                break;
            }
          
        }

        return answer;
    }
}
