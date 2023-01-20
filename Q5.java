import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String inp1  = read.readLine();
        int num=Integer.parseInt(inp1);
        System.out.println("最小階層為"+get(num));


    }

    public static int get(int number){
        int n=1;
        int m=1;
        while (m<number) {
            m=m*n;
            n+=1;
        }
        return n-1;
    }

}