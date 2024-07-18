package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1974 {
	
	public static boolean check_P_Y(int[][] graph, int x, int y) {
		boolean result = true;
		int[] numP = new int[10];
		int[] numY = new int[10];
		for(int i = 0; i < 9; i++) {
			if(++numP[graph[x][i]] > 1) {
				result = false;
				break;
			}
			if(++numY[graph[i][y]] > 1) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static boolean check_G(int[][] graph, int x, int y) {
		boolean result = true;
		int[] numG = new int[10];
		for(int i = x; i < x+3; i++) {
			for(int j = y; j < y+3 ; j++) {
				numG[graph[i][j]]++;
				if(numG[graph[i][j]] > 1) {
					result = false;
					break;
				}			
			}
		}
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			int[][] graph = new int[9][9];
			
			for(int i = 0; i < 9; i++) {
				String[] inputs = br.readLine().split(" ");
				for(int j =0; j < 9; j++) {
					graph[i][j] = Integer.parseInt(inputs[j]);
				}
			}
			int result = 1;
			A: for(int i = 0; i < 9; i++) {
				for(int j = 0; j< 9; j++) {
					if(i % 3 == 0 && j % 3 == 0) {
						if(!check_G(graph, i, j)) {
							result = 0;
							break A;
						}
					}
					if(!check_P_Y(graph, i, j)) {
						result = 0;
						break A;
					}
				}
			}
			sb.append("#").append(t).append(" ").append(result).append("\n");
		}
		System.out.println(sb);
	}
}
