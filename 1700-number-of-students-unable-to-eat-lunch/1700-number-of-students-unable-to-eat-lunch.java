import java.util.*;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        int top = 0, count = 0;
        
        for (int s : students){
            queue.add(s);
        }
        
        while(!queue.isEmpty() && count != queue.size()){
            if(queue.peek() == sandwiches[top]){
                queue.poll();
                top++;
                count = 0;
            } else {
                queue.add(queue.poll());
                count++;
            }
        }
        
        return queue.size();
    }    
}