import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
public class Q3 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String inp  = read.readLine();
        int num=Integer.parseInt(inp);
        String[] zo={"rat","ox","tiger","rabbit","dragon","snake","horse","sheep","monkey","chicken","dog","pig"};
        System.out.println(zo[(get(num))]);

    }

    public static int get(int number){
        int dif=0;
        if (number<2008){
            dif=(2008-number)%12;
            dif=12-dif;
        }
        else{
            dif=(number-2008)%12;
        }

        return dif;
    }

}