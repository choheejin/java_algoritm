package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1979 {
    public static int N;
    public static int K;

    public static int search_x(char[][] graph, int y) {
        int result = 0;
        int value_x = 0;

        for(int i = 0; i < N; i++) {
            if(graph[i][y] == '0') {
                if(value_x == K) {
                    result++;
                }
                value_x = 0;
                continue;
            }
            value_x++;
        }

        if(value_x == K) {
            result++;
        }

        return result;
    }

    public static int search_y(char[][] graph, int x) {
        int result = 0;
        int value = 0;

        for(int i = 0; i < N; i++) {
            if(graph[x][i] == '0') {
                if(value == K) {
                    result++;
                }
                value = 0;
                continue;
            }
            value++;
        }

        if(value == K) {
            result++;
        }

        return result;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());
        for(int t = 1; t<= T; t++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            char[][] graph = new char[N][N];
            for(int i = 0; i < N; i++) {
                String[] inputs = bf.readLine().split(" ");
                for(int j = 0; j < N ; j++){
                    graph[i][j] = inputs[j].charAt(0);
                }
            }

            int result = 0;
            for(int i = 0; i < N; i++) {
                result += search_x(graph, i);
                result += search_y(graph, i);
            }
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
