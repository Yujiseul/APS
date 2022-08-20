class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] arr = s.toCharArray();
        
        if(arr.length != 4 && arr.length != 6){
            answer = false;
           
        }
        
        for(char x : arr){
            if(x > '9' || x<'0'){
                answer = false;
                break;
            }
        }
        return answer;
    }
}
