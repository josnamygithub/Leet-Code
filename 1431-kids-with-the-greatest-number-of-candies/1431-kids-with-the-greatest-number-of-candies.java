
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       
        List<Boolean> result = new ArrayList();
                int max_candies = 0;

        for(int candie :candies){
            max_candies = Math.max(max_candies,candie);
        }
        
        for(int candie :candies){
            result.add(candie+extraCandies >= max_candies  );
        }
        return result;
    }
    
}
