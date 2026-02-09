import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int K, N;
    static ArrayList<Integer> numPair = new ArrayList<>();

    public static void printAnswer(){
        for(int i = 0; i < numPair.size(); i++){
            sb.append(numPair.get(i)).append(" ");
        }
        sb.append("\n");
    }

    public static void choose(int currNum){
        if(currNum == N + 1){
            printAnswer();
            return;
        }

        for(int i = 1; i <= K; i++){
            numPair.add(i);
            choose(currNum + 1);
            numPair.remove(numPair.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        choose(1);

        System.out.println(sb);
    }
}