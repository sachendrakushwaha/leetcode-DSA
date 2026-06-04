import java.util.Scanner;
import java.lang.Math;

class Solution {

    public int  reverse(int n) {
        long sum=0;
        
        if(n >= -Math.pow(2,31) && n <= (Math.pow(2,31)-1)){
            if(n<0){
            while(n!=0){
       
       int rem=n%10;
      sum=sum*10+Math.abs(rem);
      n=n/10;
        }
          if(sum > Math.pow(2,31)) return 0;
          return -(int)sum; 
    }
    else{
        while(n!=0){
       int rem=n%10;
      sum=sum*10+rem;
      n=n/10;
        }
        if(sum > (Math.pow(2,31)-1)) return 0;
        return (int)sum;
    }
        }
    else
    return 0;
    

    }
}