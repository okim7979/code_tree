import java.util.*;
import java.io.*;

class PR{
    String name;
    int height;
    double weight;

    public PR(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

}

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        PR[] p = new PR[5];
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            p[i] = new PR(st.nextToken(), Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
        }
        Arrays.sort(p, (a,b) -> a.name.compareTo(b.name));
        sb.append("name\n");
        for (int i = 0; i < 5; i++) {
            sb.append(p[i].name).append(" ").append(p[i].height).append(" ").append(p[i].weight).append("\n");
        }
        Arrays.sort(p, (a,b) -> b.height - a.height);
        sb.append("\nheight\n");
        for (int i = 0; i < 5; i++) {
            sb.append(p[i].name).append(" ").append(p[i].height).append(" ").append(p[i].weight).append("\n");
        }
        System.out.print(sb);
    }
}