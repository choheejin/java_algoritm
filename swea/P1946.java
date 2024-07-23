package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1946 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t = 1; t <= T; t++) {
            sb.append("#").append(t).append("\n");
            int N = Integer.parseInt(bf.readLine());
            char[] alphas = new char[N];
            int[] nums = new int[N];
            int total = 0;
            for(int n = 0; n < N; n++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                alphas[n] = st.nextToken().charAt(0);
                nums[n] = Integer.parseInt(st.nextToken());
                total += nums[n];
            }
            int limit = 0;
            for(int idx = 0; idx < N; idx++) {
                for(int i = 0 ; i < nums[idx]; i++) {
                    if(limit >= 10) {
                        sb.append("\n");
                        limit = 0;
                    }
                    sb.append(alphas[idx]);
                    limit++;
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
