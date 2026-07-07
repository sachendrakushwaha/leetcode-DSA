class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        StringBuilder s=new StringBuilder();
          if (n == 0) {
            return 0; 
        }
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                s.append(rem);
                sum=sum+rem;
            }
            n=n/10;


        }
        s=s.reverse();
        Long myLong = Long.parseLong(s.toString());
        return myLong*sum;
        
    }
}