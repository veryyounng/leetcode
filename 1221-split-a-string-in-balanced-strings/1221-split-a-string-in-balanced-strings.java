class Solution {
    public int balancedStringSplit(String s) {
        char[] array = s.toCharArray();
        int strLen = s.length();
        int cnt = 0; 
        int num = 0;
        for(int i = 0; i < strLen; i++){
            if(array[i] == 'L'){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt == 0){
                num++;
            }
        }
        return num;
    }
}