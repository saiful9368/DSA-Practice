class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        Map<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<l;i++){
                
                int num=nums[i];
                if(arr.containsKey(target-num)){
                    return new int[] {i,arr.get(target-num)};
                }
                arr.put(nums[i],i);
        }

        return new int[]{};


    
    }
}

