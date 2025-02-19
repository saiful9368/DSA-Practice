class Solution {
    public void moveZeroes(int[] nums) {
        int a=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a=i;
                break;
            }
        }
        if (a == -1) {
            return;
        }
        for(int j=a+1;j<nums.length;j++){
            if(nums[j]!=0){
                nums[a]=nums[j];
                nums[j]=0;
                a++;
            }
        }
        
    }
}
