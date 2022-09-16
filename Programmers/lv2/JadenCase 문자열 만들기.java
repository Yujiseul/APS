import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
       char[] arr = s.toCharArray();
       
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                continue;
            }
                
            char origin = arr[i];
            arr[i] += (char) n;
            
            //소문자(97~122)
            if(arr[i] >122){
                arr[i] = (char)(96+(arr[i]-122));
                continue;
            }
            //대문자(65~90)
             if(arr[i]>90 && origin<91){               
                arr[i] = (char)(64+(arr[i]-90));
            }
            
        }
       
        for(char x : arr){
            answer += String.valueOf(x);
        }
       
        return answer;
    }
}
