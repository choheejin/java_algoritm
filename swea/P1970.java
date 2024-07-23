package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P1970 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t = 1; t <= T; t++) {
            int N = Integer.parseInt(bf.readLine());
            List<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int i = 0; i < N; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);
            sb.append("#").append(t).append(" ");
            for(int itm: list) {
                sb.append(itm).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
