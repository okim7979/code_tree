import java.util.*;
import java.io.*;

class secret {
    String sCode;
    char mPoint;
    int time;

    public secret(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
}
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        String sCode = st.nextToken();
        char mPoint = st.nextToken().charAt(0);
        int time = Integer.parseInt(st.nextToken());
        
        secret sc1 = new secret(sCode, mPoint, time);

        sb.append("secret code : ").append(sc1.sCode).append("\n").append("meeting point : ").append(sc1.mPoint).append("\n").append("time : ").append(sc1.time).append("\n");
        System.out.println(sb);
        // Please write your code here.
    }
}