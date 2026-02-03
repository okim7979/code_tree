import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static boolean canGo(int x, int y, int n, int m, int[][] arr) {
        if(x>=0 && x<m && y>=0 && y<n) {
            if(arr[y][x]==0) {
                return true;
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int[] dx = new int[]{1, 0 ,-1 ,0};
        int[] dy = new int[]{0, -1, 0, 1};

        int x = 0; //열
        int y = 0; //행

        int direct = 3;
        int count = 0;

        for (int i = 0; i < n*m; i++) {
                arr[y][x] = ++count;
                if(!canGo(x+dx[direct], y+dy[direct], n, m, arr)) {
                    direct = (direct + 1) % 4;
                }
                x += dx[direct];
                y += dy[direct];
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}