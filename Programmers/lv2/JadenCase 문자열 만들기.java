import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
       char[] arr = s.toCharArray();
       
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                continue;
            }
                
            
            arr[i] += (char) n;
            
            if(arr[i]>90){
                arr[i] = (char)(64+(arr[i])-90);
                continue;
            }
           
            
            if(arr[i] >122){
                arr[i] = (char)(96+(arr[i]-122));
            }
            
            
        }
       
        for(char x : arr){
            answer += String.valueOf(x);
        }
        System.out.println((int)'a');
        System.out.println((int)'z');     
        System.out.println((int)'A');   
        System.out.println((int)'Z');
       
        return answer;
    }
}
