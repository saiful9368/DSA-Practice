class Solution {
    public int majorityElement(int[] nums) {
        int result=0;
        int mj=0;
        for(int n:nums){
            if(mj==0){
                result=n;
            }
            if(result==n){
                mj=mj+1;
            }
            else{
                mj=mj-1;
            }
        }
        return result;
    }
}
