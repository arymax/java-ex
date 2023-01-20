import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class Q15 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inp  = bfReader.readLine().split("");
        List<String> tmp = new ArrayList<String>();
        List<String> a = Arrays.asList(inp);
        Collections.swap(a,0,2);
        Collections.swap(a,1,3);
        int n=0;
        String str="";

        for(int i=0;i<a.size();i++) {
            n=(Integer.valueOf(a.get(i))+7)%10;
            tmp.add(String.valueOf(n));
        }
        for (String x : tmp) {
			str+= x;
		}
        System.out.println(str);

    }
}