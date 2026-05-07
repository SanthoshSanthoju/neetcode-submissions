class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i =0;i<n;i++){
            if(hm.containsKey(nums[i])){
                int abs = Math.abs(hm.get(nums[i])-i);
                if(abs<= k)
                 return true;
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}