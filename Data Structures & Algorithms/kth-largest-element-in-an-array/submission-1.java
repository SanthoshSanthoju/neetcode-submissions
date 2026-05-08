class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
           pq.offer(nums[n-1-i]);
        }
        int ans = 0;
        for(int i =0;i<k;i++){
            ans = pq.poll();
        }
        return ans;
    }
}
