import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine().trim());
        int[] numList = new int[n];
        int[] numRank = new int[n];
        int[] addList = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            numList[i] = Integer.parseInt(st.nextToken());
            numRank[i] = numList[i];
            addList[i] = 0;
        }
        Arrays.sort(numList);

        for(int i = 0; i < n; i++){ //rank
            for(int j = 0; j < n; j++){//list
                if (numRank[i] == numList[j]){
                    int count = 1;
                    for(int k = 0; k < n; k++){
                        if(numRank[i] == addList[k]){
                            count++;
                        }
                    }
                    int num = j+count;
                    sb.append(num).append(" ");
                    addList[i] = numRank[i];
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}