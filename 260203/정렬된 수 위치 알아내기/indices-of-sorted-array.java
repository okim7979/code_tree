import java.util.*;
import java.io.*;

class arrList implements Comparable<arrList>{
    int num;
    int at;

    public arrList(int num, int at){
        this.num = num;
        this.at = at;
    }

    @Override
    public int compareTo(arrList o) {
        if(this.num == o.num){
            return this.at - o.at;
        }
        return this.num - o.num;
    }
}

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());
        arrList[] arr = new arrList[n];
        for(int i = 0; i < n; i++){
            arr[i] = new arrList(Integer.parseInt(st.nextToken()), i);
        }
        Arrays.sort(arr);

        int[] arrWhere = new int[n];
        for(int i = 0; i < n; i++){
            arrWhere[arr[i].at] = i+1;
        }
        for(int i = 0; i < n; i++){
            sb.append(arrWhere[i]).append(" ");
        }
        System.out.println(sb);
    }
}