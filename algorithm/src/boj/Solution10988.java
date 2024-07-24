package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10988
// 팰린드롬 문제 đọc từ trái hay phải đều giống
public class Solution10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader( new InputStreamReader(System.in));
        String isPalindrome = reader.readLine();
        int result = 1;
        //양쪽을 비교한는 거기 때문에 갈이의 절번먼 반복해도 된다.
        for (int i = 0; i < isPalindrome.length() / 2; i++) {
            if (isPalindrome.charAt(i) != isPalindrome.charAt(isPalindrome.length() - i -1));
            result = 0;
            break;

        }
        System.out.println(result);
    }

}
