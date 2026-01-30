import java.util.*;
import java.io.*;

class BombHasBeenDefused {
    String bCode;
    char bColor;
    int dTime;

    public BombHasBeenDefused(String bCode, char bColor, int dTime){
        this.bCode = bCode;
        this.bColor = bColor;
        this.dTime = dTime;
    }
}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine());

        String bCode = st.nextToken();
        char bColor = st.nextToken().charAt(0);
        int dTime = Integer.parseInt(st.nextToken());

        BombHasBeenDefused bd = new BombHasBeenDefused(bCode, bColor, dTime);

        sb.append("code : ").append(bd.bCode).append("\n");
        sb.append("color : ").append(bd.bColor).append("\n");
        sb.append("second : ").append(bd.dTime).append("\n");

        System.out.println(sb);
    }
}