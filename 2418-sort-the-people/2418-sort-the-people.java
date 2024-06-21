class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer,String> ValuesMap = new HashMap();
        
        for(int i =0; i<names.length ;i++){
            ValuesMap.put(heights[i],names[i]);
            }
         return 
             Arrays.stream(heights)
                    .boxed()
                    .sorted((a,b) ->b -a)
                    .map(ValuesMap::get)
                    .toArray(String[]::new);
            
    }
}