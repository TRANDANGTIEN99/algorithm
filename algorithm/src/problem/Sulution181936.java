package problem;
// https://school.programmers.co.kr/learn/courses/30/lessons/181936
public class Sulution181936 {
    public int solution(int number, int n, int m) {
        if (number % n != 0) return 0;
        if (number % m != 0) return 0;
        return 1;
    }
}

