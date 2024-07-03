import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Create sets from the arrays
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Find distinct integers in nums1 not present in nums2
        List<Integer> distinct1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                distinct1.add(num);
            }
        }
        
        // Find distinct integers in nums2 not present in nums1
        List<Integer> distinct2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                distinct2.add(num);
            }
        }
        
        // Prepare the answer list
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(distinct1);
        answer.add(distinct2);
        
        return answer;
    }
}
