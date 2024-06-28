class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zero = 0, one = 0;
        for(char ch: s.toCharArray()){
            if(ch == '0'){
                zero++;
            }else{
                one++;
            }
        }
        StringBuilder str = new StringBuilder("");
        while(one-- > 1){
            str.append('1');
        }
        while(zero-- > 0){
            str.append('0');
        }
        str.append('1');
        return str.toString();
    }
}