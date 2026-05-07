class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int idx1 = 0,idx2 = numbers.length-1;
        for(int i=0;i<n;i++){
           if(numbers[idx1]+numbers[idx2] == target){
             return new int[]{idx1+1,idx2+1};
           }
           if(numbers[idx1]+numbers[idx2] > target){
            idx2--;
           }
           if(numbers[idx1]+numbers[idx2] < target){
            idx1++;
           }

        }
        return new int[]{};
    }
}
