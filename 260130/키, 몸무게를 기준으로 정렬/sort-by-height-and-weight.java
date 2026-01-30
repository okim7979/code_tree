import java.util.*;
import java.io.*;

class Inbody implements Comparable<Inbody>{
    String name;
    int height;
    int weight;
    public Inbody(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(Inbody o) {
        if(this.height == o.height){
            return o.weight - this.weight;
        }
        return this.height - o.height;
    }
}
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Inbody[] in = new Inbody[n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            in[i] = new Inbody(name, height, weight);
        }
        Arrays.sort(in);

        for(int i = 0; i < n; i++){
            sb.append(in[i].name).append(" ").append(in[i].height).append(" ").append(in[i].weight).append("\n");
        }
        System.out.println(sb);
    }
}