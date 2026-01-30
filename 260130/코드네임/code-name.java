import java.util.*;
import java.io.*;

class Agent implements Comparable<Agent>{
    char codename;
    int score;

    public Agent(char codename, int score){
        this.codename = codename;
        this.score = score;
    }

    @Override
    public int compareTo(Agent o){
        return this.score - o.score;
    }
}
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        Agent[] agList = new Agent[5];
        for(int i = 0; i < 5; i++){
            st = new StringTokenizer(br.readLine());
            char codename = st.nextToken().charAt(0);
            int score = Integer.parseInt(st.nextToken());
            agList[i] = new Agent(codename, score);
        }
        Arrays.sort(agList);
        Agent ag1 = agList[0];
        sb.append(ag1.codename).append(" ").append(ag1.score);
        System.out.println(sb);
    }
}