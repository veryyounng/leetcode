class Solution {

  public int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();
    int sum = 0;
    for (String operation : operations) {
      int num;
      switch (operation) {
        case "+":
          num = stack.pop();
          int add = num + stack.peek();
          sum += add;
          stack.push(num);
          stack.push(add);
          break;
        case "D":
          num = stack.peek() * 2;
          sum += num;
          stack.push(num);
          break;
        case "C":
          sum -= stack.pop();
          break;
        default:
          num = Integer.parseInt(operation);
          sum += num;
          stack.push(num);
      }
    }
    return sum;
  }

}