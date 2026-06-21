class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCount=0;
        for(int n:costs){
            if(n>maxCount){
                maxCount=n;
            }
        }
        int[] freq=new int[maxCount+1];
        for(int m:costs){
            freq[m]++;
        }
        int iceCount=0;
        for(int a=1;a<=maxCount;a++){
            if(freq[a]==0){
                continue;
            }
            if(coins<a){
                break;
            }
            int cToBuy=Math.min(freq[a],coins/a);
            coins=coins-cToBuy*a;
            iceCount=iceCount+cToBuy;
        }
        return iceCount;
    }
}