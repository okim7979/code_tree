import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int[][] grid;
    static int[][] visited;

    static int pc = 0;
    static ArrayList<Integer> al = new ArrayList<>();

    public static void dfs(int i, int j) {
        if(visited[i][j] != 0) return;

        visited[i][j] = 1;
        pc++;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1 , 0, -1};

        for(int k = 0; k < 4; k++){
            int nx = i + dx[k];
            int ny = j + dy[k];

            if(canGo(nx, ny)){
                dfs(nx, ny);
            }
        }
    }

    public static boolean inRange(int i, int j) {
        return i >= 0 && i < N && j >= 0 && j < N;
    }

    public static boolean canGo(int i, int j) {
        if(!inRange(i, j)) return false;
        if(visited[i][j] != 0 || grid[i][j] == 0) return false;
        return true;
    }
    public static void main(String[] args) throws IOException {
        st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        grid = new int[N][N];
        visited = new int[N][N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(grid[i][j] == 1 && visited[i][j] == 0){
                    pc = 0;
                    dfs(i, j);
                    al.add(pc);
                }
            }
        }
        Collections.sort(al);
        sb.append(al.size()).append("\n");

        for(Integer a : al){
            sb.append(a).append("\n");
        }

        System.out.println(sb);
    }
}