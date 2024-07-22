package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1976 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());
        for(int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());

            int resultH = h1+h2;
            int resultM = m1+m2;
            if(m1 + m2 >= 60) {
                resultH += (int) (resultM / 60);
                resultM = (int) (resultM % 60);
            }
            if(resultH > 12) {
                resultH = (int) (resultH % 12);
            }
            if(resultH == 0) {
                resultH = 12;
            }
            sb.append("#").append(t).append(" ").append(resultH).append(" ").append(resultM).append("\n");
        }
        System.out.print(sb);
    }
}
