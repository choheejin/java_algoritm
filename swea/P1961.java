package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1961 {
    public static int N = 0;

    public static char[][] rotate(char[][] graph) {
        char[][] res = new char[N][N];
        int x = 0;
        for(int i = 0; i < N; i++) {
            int y = 0;
            for(int j = N-1; j >= 0; j--) {
                res[x][y] = graph[j][i];
                y++;
            }
            x++;
        }
        return Arrays.copyOf(res, N);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(bf.readLine());

        for(int t = 1; t<=T; t++){
            N = Integer.parseInt(bf.readLine());
            char[][] graph = new char[N][N];
            for(int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                for(int j = 0; j < N; j++) {
                    graph[i][j] = st.nextToken().charAt(0);
                }
            }
            char[][] rotate90 = rotate(graph);
            char[][] rotate180 = rotate(rotate90);
            char[][] rotate270 = rotate(rotate180);
            sb.append("#").append(t).append("\n");

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j ++){
                    sb.append(rotate90[i][j]);
                }
                sb.append(" ");
                for(int j = 0; j < N; j ++){
                    sb.append(rotate180[i][j]);
                }
                sb.append(" ");
                for(int j = 0; j < N; j ++){
                    sb.append(rotate270[i][j]);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}
