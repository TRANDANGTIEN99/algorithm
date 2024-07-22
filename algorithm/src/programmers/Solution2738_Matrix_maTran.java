package programmers;

//https://www.acmicpc.net/problem/2738
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2738_Matrix_maTran {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        // 첫번째 줄 입력을 N과 M으로 Parse
        String[] tokens = reader.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        // 행렬의 크기를 바탕으로 2차원 배열들을 만든다.
        // a행렬
        int[][] a = new int[n][m];
        // b행렬
        int[][] b = new int[n][m];
        // 합한 결과 행렬
        int[][] result = new int[n][m];

        // n만큼 반복하면서
        for (int i = 0; i < n; i++) {
            // 문자열을 입력받고
            // 문자열을 해석해서 각 줄에 입력해준다.
            tokens = reader.readLine().split(" ");
            int[] row = a[i];
            for (int j = 0; j < m; j++) {
                row[j] = Integer.parseInt(tokens[j]);
            }
            /*int[] nums = new int[m];
            for (int j = 0; j < m; j++) {
                nums[j] = Integer.parseInt(tokens[j]);
            }
            // a의 i번째 줄을 받아오고
            int[] row = a[i];
            for (int j = 0; j < m; j++) {
                // a의 i번재 줄의 j번째에 잘 할당해준다.
                row[j] = nums[j];
            }*/
        }
        for (int i = 0; i < n; i++) {
            // 문자열을 입력받고
            // 문자열을 해석해서 각 줄에 입력해준다.
            tokens = reader.readLine().split(" ");
            int[] row = b[i];
            for (int j = 0; j < m; j++) {
                row[j] = Integer.parseInt(tokens[j]);
            }
            for (i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }

            // Output the result matrix
            StringBuilder answer = new StringBuilder();
            for (i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // [i][j]를 문자열에 추가
                    answer.append(result[i][j])
                            .append(" ");
                }
                // 한줄 추가
                answer.append('\n');
            }

            System.out.print(answer);
        }
    }
}

