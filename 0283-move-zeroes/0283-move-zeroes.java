//step1: iterate the array 
// i is not equal to 0;
//index =0;
// numsZero[index] =nums[i]; index++;
//if nums.length ==1 ;return ;

class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i< nums.length ;i++){
            
            if(nums[i] !=0){
                nums[index]=nums[i];
                index++;
            }
        }
        while(index < nums.length){
        nums[index]=0;
            index++;
        }
    }
}