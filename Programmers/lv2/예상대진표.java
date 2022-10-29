import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

       while(true){
         answer++;
           
           int min = a>b? b : a;
           int max = a>b? a : b;
           
           if(min%2 == 0){
               if()
           }
           
           if(Math.abs(a-b) == 1){
               break;
           }
           
           a = (a%2 != 0)?(a+1)/2 : a/2;
           
           
           if(b%2 != 0){
               b = (b+1)/2;
           }else{
               b /= 2;
           }
       }
   
        return answer;
    }
}
