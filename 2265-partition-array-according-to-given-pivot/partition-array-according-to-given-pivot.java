class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res=new int[nums.length];
        int index=0;
        for(int n:nums){
            if(n<pivot){
                res[index]=n;
                index++;
            }
        }
        for(int n:nums){
            if(n==pivot){
                res[index]=n;
                index++;
            }
        }
        for(int n:nums){
            if(n>pivot){
                res[index]=n;
                index++;
            }
        }
        return res;
        
    }
}