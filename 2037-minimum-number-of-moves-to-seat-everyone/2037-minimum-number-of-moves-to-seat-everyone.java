class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int cnt = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i = 0; i < seats.length; i++){
                cnt += Math.abs(seats[i] - students[i]);
        }
        return cnt;
    }
}