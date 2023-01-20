import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
public class Q7 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inp  = bfReader.readLine().split(",");
        double type=Double.valueOf(inp[0]);
        double time=Double.valueOf(inp[1]);
        System.out.print("通話費"+count(type, time));

    }

    public static double count(double type,double time){
        double total=0.0;
        if (type==186) {
            total=(int)Math.round(time* 0.09);
            if (total < type*2 && total > type) {
                total=Math.round(total * 0.9);
            }
            if (total>type*2){
                total=Math.round(total * 0.8);
            }
        }
        if (type==386) {
            total=(int)Math.round(time* 0.08);
            if (total < type*2 && total > type) {
                total=Math.round(total * 0.8);
            }
            if (total>type*2){
                total=Math.round(total * 0.7);
            }
        }
        if (type==586) {
            total=Math.round(time* 0.07);
            if (total < type*2 && total > type) {
                total=Math.round(total * 0.7);
            }
            if (total>type*2){
                total=Math.round(total * 0.6);
            }
        }
        if (type== 986) {
            total = Math.round(time* 0.06);
            if (total < type*2 && total > type) {
                total=Math.round(total * 0.6);
            }
            if (total>type*2){
                total=Math.round(total * 0.5);
            }

        }
        return total;
    }

}