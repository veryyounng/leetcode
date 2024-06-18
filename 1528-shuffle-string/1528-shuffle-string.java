class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charArr = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            charArr[indices[i]] = s.charAt(i);
        }
        String output = String.valueOf(charArr);
        return output;
    }
}