import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = s.length();
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = 0;
        int y = 0;
        int direct = 3;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'L'){
                direct = (direct + 3) % 4;
            }
            else if(s.charAt(i) == 'R'){
                direct = (direct + 1) % 4;
            }
            else {
                x += dx[direct];
                y += dy[direct];
            }
        }
        sb.append(x).append(" ").append(y);
        System.out.println(sb);
    }
}