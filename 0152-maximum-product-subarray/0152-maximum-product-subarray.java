class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;

        for (int num : nums) {

            if(num < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(num, max * num);
            min = Math.min(num, min * num);

            maxProduct = Math.max(max, maxProduct);
        }
        return maxProduct;
    }
}