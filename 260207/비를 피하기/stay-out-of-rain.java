import java.util.*;
import java.io.*;

class endPoint{
    int endx;
    int endy;

    public endPoint(int endx, int endy){
        this.endx = endx;
        this.endy = endy;
    }
}

class startPoint{
    int startx;
    int starty;
    public startPoint(int startx, int starty){
        this.startx = startx;
        this.starty = starty;
    }
}

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N, H, M;

    static Queue<int[]> q = new LinkedList<>();
    static int[][] grid;
    static int[][] visited;
    static int[][] ans;

    static ArrayList<endPoint> endPoints = new ArrayList<>();
    static ArrayList<startPoint> startPoints = new ArrayList<>();

    public static void bfs(){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0 ,1};

        while(!q.isEmpty()){
            int[] a = q.poll();
            int x = a[0];
            int y = a[1];

            for(int i = 0; i < dx.length; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(canGo(nx, ny) && visited[nx][ny] == 0){
                    visited[nx][ny] = visited[x][y]+1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }

    public static boolean inRange(int x, int y){
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    public static boolean canGo(int x, int y){
        if(!inRange(x,y)) return false;
        if(grid[x][y] == 1) return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        grid = new int[N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                int num = Integer.parseInt(st.nextToken());
                grid[i][j] = num;
                if(num == 3){

                    endPoints.add(new endPoint(i, j));
                } else if(num == 2){

                    startPoints.add(new startPoint(i, j));
                }
            }
        }
        ans = new int[N][N];
        visited = new int[N][N];
        for(endPoint e : endPoints){
            visited[e.endx][e.endy] = 1;
            q.add(new int[]{e.endx, e.endy});
        }
        bfs();
        for(startPoint s : startPoints){
            if(visited[s.startx][s.starty] == 0){
                ans[s.startx][s.starty] = -1;
            } else {
                ans[s.startx][s.starty] = visited[s.startx][s.starty] - 1;
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(ans[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}