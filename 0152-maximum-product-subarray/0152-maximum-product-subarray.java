class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int min = 1;
        int max = 1;
        for(int num : nums){
            if(num < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            min = Math.min(num, num * min);
            max = Math.max(num, num * max);
            maxProduct = Math.max(max, maxProduct);
        }
        return maxProduct;
    }
}