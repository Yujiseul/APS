// sort
// 가장 큰 수와 그 다음으로 큰 수와의 최소 공배수 구하기
// 그 다음에 내려가면서 작은 숫자와의 배수가 되는지 확인 후
// 맞으면 continue
// 아니면 둘 간에 최소공배수 구하기

//주의) 런타임에러

import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        int com = arr[arr.length-1];
        while(true){
        for(int i = arr.length-2; i>=0; i--){
            
                while(true){
                    if(com%arr[i] != 0){
                        com++;
                    }else{
                        break;
                    }
                }
             
         }
            boolean flag = true;
            
            for(int i=0; i<arr.length; i++){
                if(com%arr[i] != 0){
                    flag = false;
                    break;
                }
            }
            
            if(flag){
                break;
            }
        }
        answer = com;
        
        return answer;
    }
}
