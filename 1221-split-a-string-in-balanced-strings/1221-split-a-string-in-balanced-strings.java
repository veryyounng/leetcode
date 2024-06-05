class Solution {
    public int balancedStringSplit(String s) {
        char[] arr = s.toCharArray();
        int strlen = s.length();
        int matchCounter = 0; 
        int num = 0;
        for(int i = 0; i < strlen; i++){
            if(arr[i] == 'L'){
                matchCounter ++;
            }else{
                matchCounter--;
            }if(matchCounter == 0){
                num++;
            }
        }
        return num;
    }
}