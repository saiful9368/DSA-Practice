class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];

        }
        int ns=n*(n+1)/2;
        return ns-sum;
    }
}
