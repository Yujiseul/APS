class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].charAt(0)<97 || arr[i].charAt(0)>122){
                answer += arr[i];
                answer += " ";
                continue;
            }
            String temp = arr[i].substring(0,1).toUpperCase();
            System.out.println("값" + temp);
           answer += temp;
            answer += arr[i].substring(1,arr[i].length()).toLowerCase();
            answer += " ";
        }
        
        answer = answer.trim();
        return answer;
    }
}

// 실패, 
