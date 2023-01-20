import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
public class Q1 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String[] inp  = read.readLine().split("");

        String str="";
        //ArrayList strarray = new ArrayList();
        int ans = 0;
        for (int i = 0; i < inp.length; i++) {
            for (int j = i; j < inp.length; j++) {
                str=str+String.valueOf(inp[j]);
                System.out.println(str);
                int temp = Integer.parseInt(str);
                if (prime(temp)==1 && temp > ans) {
                    ans = temp;
                }
            }
            str="";
        }
        System.out.println("最大的質數值為"+(ans));
    }

    public static int prime(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && i != number) {
                return 0;
            }
        }
        return 1;
    }

}