package programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181893
// 어려운 문제
public class Solution181893 {
    public int[] solution(int[] arr, int[] query) {
        int left = 0;
        int right = arr.length;
        for (int i = 0; i < query.length; i++) {
            if ( i % 2 == 0) {
                right = left + query[i] + 1;
            }
            else{
                left +=query[i];
            }
        }
        int[] answer = new int[right - left];
        for (int i = 0; i < right - left; i++) {
            answer[i] = arr[left + i];
        }
        return answer;
    }
}

