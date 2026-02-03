import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine().trim());
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int x = 0;
        int y = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            int wasdint = 0;
            char wasd = st.nextToken().charAt(0);
            if(wasd == 'N'){
                wasdint = 3;
            } else if(wasd == 'S'){
                wasdint = 1;
            } else if(wasd == 'W'){
                wasdint = 2;
            }
            int go = Integer.parseInt(st.nextToken());
            x += dx[wasdint]*go;
            y += dy[wasdint]*go;
        }
        sb.append(x).append(" ").append(y);
        System.out.println(sb);
    }
}