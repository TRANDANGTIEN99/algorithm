package programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181886
public class Solution181886 {
    public String[] solution(String[] names) {
        int arrLen = names.length / 5;
        if ( names.length % 5 != 0) arrLen++;
        String[] answer = new String[arrLen];
        for (int i = 0; i < names.length; i+= 5) {
            // i == 0 , 5 , 10, 15....
            answer[i / 5]= names[i];
        }
        return answer;
    }
}
