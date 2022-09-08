class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].charAt(0)<97 || arr[i].charAt(0)>122){
                continue;
            }
           String temp = arr[i].substring(0,1).toUpperCase();
           arr[i].substring(0,1) = temp;
        }
        
        System.out.println((int)'a');
        System.out.println((int)'A');
        
        return answer;
    }
}
