import java.util.*;
import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N;
    static ArrayList<Integer> numPair = new ArrayList<>();
    static int ans = 0;

    public static void prettyNum() {
        boolean isPretty = true;

        for(int i = 0; i < numPair.size(); ) {
            int currVal = numPair.get(i);
            for(int j = 1; j < numPair.get(i); j++) {
                if(i+j >= numPair.size() || !numPair.get(i+j).equals(currVal)) {
                    isPretty = false;
                    break;
                }
            }
            if(!isPretty) break;

            i += currVal;
        }
        if(isPretty) {
            
            ans++;
        }
    }

    public static void choose(int currNum){
        if(currNum == N + 1){
            prettyNum();
            return;
        }

        for(int i = 1; i <= 4; i++){
            numPair.add(i);
            choose(currNum + 1);
            numPair.remove(numPair.size() -1);
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        choose(1);

        sb.append(ans);

        System.out.println(sb);
    }
}