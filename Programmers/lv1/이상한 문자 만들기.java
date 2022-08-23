class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        
         int cnt = 0;
        for(int i=0; i<arr.length; i++){
           
            if(arr[i].equals(" ")){
                answer+=" ";
                cnt = 0;
                continue;
            }
            
            if(cnt%2 == 0){
                cnt++;
                answer += arr[i].toUpperCase();
            }else{
                cnt++;
                answer += arr[i].toLowerCase();
            }
        }
        
        return answer;
    }
}
