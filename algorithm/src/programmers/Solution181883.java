package programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181883
public class Solution181883 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        // queries의 갯수만큼 반복한다.
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            // start는 query[0]
            // end는 query[1]
            int start = query[0];
            int end = query[1];
            // start 부터 end까지 answer의 배열을
            for (int j = start; j < end + 1; j++) {
                // += 1 한다.
                answer[j]++;
            }
        }
        return answer;
    }
}
