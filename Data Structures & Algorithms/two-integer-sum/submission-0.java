class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i=0;i<n;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int rem = target-nums[i];
            if(hm.containsKey(rem)){
                int idx2 = hm.get(rem);
                if (i != idx2) return new int[]{i,idx2};
            }
        }
        return new int[]{};
    }
}
