class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> candidate = new ArrayList<>();
        
        candidate.add(1); // 가장 첫번째 배열을 생성한다. 즉, 첫번째 층이 된다.
        result.add(candidate); // 첫번째 층을 저장한다. 
        
        for(int i = 1; i < numRows; i++) {
            candidate = new ArrayList<>(); // 배열 초기화
            candidate.add(1); // 모든 배열의 첫번째 원소는 1이다. 이를 저장한다. 
            
            for(int j = 1; j < i; j++) {
                int element = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                candidate.add(element);
            }
            candidate.add(1); // 모든 배열의 마지막 원소는 1이다. 이를 저장한다. 
            result.add(candidate); // 완성된 배열을 result에 저장한다. 한개의 층이 완성된 것이다. 
        }
        return result;
    }
}

