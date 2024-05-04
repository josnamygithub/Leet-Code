class Solution {
    public int lengthOfLastWord(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=s.length() - 1;i>=0;i--){
            char z = s.charAt(i);
            if(z != ' '){
                list.add(z);
            }else if(list.isEmpty()){
                continue;
            }
            else{
                break;
            }
        }
        return list.size();
    }
}