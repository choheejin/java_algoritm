package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1983 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] scores = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
        for(int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int range = (int) N / 10;
            double targetValue = 0;

            double[] arr = new double[N];

            for(int i = 0; i < N ; i++) {
                st = new StringTokenizer(br.readLine());
                int mid = Integer.parseInt(st.nextToken());
                int fin = Integer.parseInt(st.nextToken());
                int hom = Integer.parseInt(st.nextToken());
                arr[i] = mid * 0.35 + fin * 0.45 + hom * 0.20;
                if (i+1 == K) {
                    targetValue = arr[i];
                }
            }

            Arrays.sort(arr);

            int idx = 0;
            for(int i = 0; i < N; i++){
                if(targetValue == arr[i]) {
                    idx = i;
                    break;
                }
            }
            idx = (int) idx/(range);
            System.out.printf("#%d %s\n", t, scores[idx]);
        }

    }
}
