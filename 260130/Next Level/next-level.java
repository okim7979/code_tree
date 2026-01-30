import java.util.*;
import java.io.*;

class NextLevel {
    String id;
    int level;
    public NextLevel(){
        this.id = "codetree";
        this.level = 10;
    }
    public NextLevel(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        String id = st.nextToken();
        int level = Integer.parseInt(st.nextToken());

        NextLevel nl = new NextLevel();
        sb.append("user ").append(nl.id).append(" lv ").append(nl.level).append("\n");

        nl.id = id;
        nl.level = level;

        sb.append("user ").append(nl.id).append(" lv ").append(nl.level).append("\n");

        System.out.println(sb);

        // Please write your code here.
    }
}