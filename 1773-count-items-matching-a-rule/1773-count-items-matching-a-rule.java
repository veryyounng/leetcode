class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        if(ruleKey.equals("type")){
            return iter(items, 0, ruleValue);
        }else if(ruleKey.equals("color")){
            return iter(items, 1, ruleValue);
        }else{
            return iter(items, 2, ruleValue);
        }
    }
    public int iter(List<List<String>> items, int index, String ruleValue){
        int cnt = 0;
        for(List<String> l : items){
            if(l.get(index).equals(ruleValue)){
                cnt++;
            }
        }
        return cnt;

    }
}