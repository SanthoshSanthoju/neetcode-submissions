class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<n;i++){
           pq.offer(nums[i]);
        }
        int ans = 0;
        for(int i =0;i<k;i++){
            ans = pq.poll();
        }
        return ans;
    }
}
