import java.util.Arrays ;
class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max_val =nums[nums.length-1];
       int sum =max_val;
        for(int i =1;i <k ;i++){
            sum += max_val+i ;
         }
            return sum;

    }
}