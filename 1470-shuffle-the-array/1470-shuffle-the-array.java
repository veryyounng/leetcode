class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list1.add(nums[i]);
        }
        for(int i = n; i < nums.length; i++){
            list2.add(nums[i]);
        }
        for(int i = 0; i < list1.size(); i++){
            answer.add(list1.get(i));
            answer.add(list2.get(i));
        }
        
        int[] arr = new int[answer.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = answer.get(i);
        }
        return arr;
    }
}