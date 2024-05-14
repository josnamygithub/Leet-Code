class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for (int i =0;i <nums.length-1 ;i++){
        //     for(int j =i +1 ;j< nums.length ;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int [] {i ,j};
        //         }
        //     }
        // }
        // return new int[]{};
        

        Map<Integer, Integer> nummap =new HashMap<>();
        for(int i = 0; i < nums.length ;i++){
            nummap.put(nums[i] , i);
        }

        for (int i =0 ;i<nums.length ;i++){
            if(nummap.containsKey(target-nums[i]) && nummap.get(target-nums[i])!= i){
                return new int[] {i, nummap.get(target-nums[i])};
            }
        }
        return new int[]{};
    }
}