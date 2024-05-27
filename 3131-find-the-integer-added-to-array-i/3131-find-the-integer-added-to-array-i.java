//equal length
//each element in nums1 will increased / decreased when adding x 
//the result nums1 is equal to nums2 
//two array was incressed 
// 

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0  ,sum2  =0 ,result =1;
        

        for (int i =0 ;i < nums1.length ;i++){
             sum1 +=nums1[i] ;
            
            }
             for (int i =0 ;i < nums1.length ;i++){
             sum2 +=nums2[i] ;
            
            }
        
             result = (sum2 -sum1 )/nums1.length;
        
            
            
        return result ;
    }
}