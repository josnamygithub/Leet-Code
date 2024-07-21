//1 )  target is must be greater compare than numbers in array
// 2)   if  num[0] + num[1] =target  return array with indices . 
// 3)  if another way    9 -2 =7 , 9- 7 = 2 ,  9- 11 =3 , 9-15 = 6
class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        for (int i =0 ; i< nums.length;i++){
            for(int j =i+1 ;j < nums.length ;j++){
                if(nums[i] + nums[j] ==target){
                    
                    return new int[] {i,j};
                }
                     
            }
        }
        
       return new int[] {} ;
    }
}