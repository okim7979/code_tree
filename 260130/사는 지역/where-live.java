import java.util.*;
import java.io.*;


class Addr implements Comparable<Addr>{
    String name;
    String locateNum;
    String locateName;

    public Addr(String name, String locateNum, String locateName){
        this.name = name;
        this.locateNum = locateNum;
        this.locateName = locateName;
    }

    @Override
    public int compareTo(Addr o) {
        return o.name.compareTo(this.name);
    }
}

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Addr[] addrlist = new Addr[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String locateNum = st.nextToken();
            String locateName = st.nextToken();
            addrlist[i] = new Addr(name, locateNum, locateName);
        }
        Arrays.sort(addrlist);
        sb.append("name ").append(addrlist[0].name).append("\n");
        sb.append("addr ").append(addrlist[0].locateNum).append("\n");
        sb.append("city ").append(addrlist[0].locateName).append("\n");

        System.out.println(sb);
    }
}