class Solution {
    public int numOfSubarrays(int[] arr) {
       int a=1000000007;
       int result=0;
       int currentSum=0;
       int evenCount=1;
       int oddCount=0;
   for(int num:arr){
    currentSum +=num;
    if(currentSum%2!=0){
        result=(result+evenCount)%a;
        oddCount++;
    }else{
        result=(result+oddCount)%a;
        evenCount++;
    }
   }
     return(int) result;
    }
}   
     
        