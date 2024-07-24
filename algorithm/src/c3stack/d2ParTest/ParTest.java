package c3stack.d2ParTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(test(reader.readLine()));

        // 테스트 케이스
       /* String line1 = "(())"; // 정상적으로 매칭
        String line2 = "(()";  // 매칭되지 않음
        String line3 = "())("; // 매칭되지 않음

        System.out.println(test(line1)); // true
        System.out.println(test(line2)); // false
        System.out.println(test(line3)); // false*/
    }

    // line이라는 매개변수가 괄호로 이뤄져 있다고 할 때
    // line의 괄호가 정상적으로 매칭이 되는지
    private static boolean test(String line) {
        // Java의 Stack
        Stack<Character> parStack = new Stack<>();

        // line의 각 글자를 확인한다.
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            // 만약 글자가 '(' 라면 스택에 푸시한다.
            if (ch == '(') {
                parStack.push(ch);
            } else if (ch == ')') {
                // 스택이 비어있다면 false
                if (parStack.isEmpty()) {
                    return false;
                }
                // 아니라면 스택에서 팝한다.
                parStack.pop();
            }
        }

        // 스택이 비어있으면 true, 아니면 false
        return parStack.isEmpty();
    }
}
// (()(()))
// (()))
// (())(