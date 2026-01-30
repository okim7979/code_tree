import java.util.*;
import java.io.*;

class storeItem{
    String idName;
    int code;
    public storeItem(){
        this.idName = "codetree";
        this.code = 50;
    }
    public storeItem(String idName, int code){
        this.idName = idName;
        this.code = code;
    }
}

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        String idName = st.nextToken();
        int code = Integer.parseInt(st.nextToken());
        storeItem st1 = new storeItem();
        storeItem st2 = new storeItem(idName, code);
        sb.append("product ").append(st1.code).append(" is ").append(st1.idName).append("\n");
        sb.append("product ").append(st2.code).append(" is ").append(st2.idName).append("\n");
        System.out.print(sb);
    }
}