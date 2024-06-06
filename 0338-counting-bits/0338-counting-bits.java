class Solution {
    public int[] countBits(int num) {
      int[] result = new int[num+1];
      
      for (int i = 0; i < num+1 ; i++) {
        if (result[i] != 0) continue;
        result[i] = result[i/2] + i % 2;
      }
      return result;
    }
}