import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Q2 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String inp  = read.readLine();
        int num=Integer.parseInt(inp);
        double sum=0;
        double nonsum=0;
        Double[] total=money(num,sum,nonsum);
        System.out.println("Summer months"+total[0]);
        System.out.println("Summer months"+total[1]);
    }
    public static Double[] money(int number,double sum,double nonsum){
        if (number >= 701) {
            sum+= (number-700 )*5.63;
            nonsum+= (number-700 )*4.50;
            number= 700;
        }

        if (number >= 501 && number <= 700) {
            sum+= (number-500 )*4.97;
            nonsum+= (number-500 )*4.01;
            number= 500;
        }
        if (number >= 331 && number <= 500) {
            sum+= (number-330 )*4.39;
            nonsum+= (number-330 )*3.61;
            number= 330;
        }
        if (number >= 121 && number <= 330) {
            sum+= (number-120 )*3.02;
            nonsum+= (number-120 )*2.68;
            number= 120;
        }
        if (number <=120) {
            sum+= number*2.10;
            nonsum+= number*2.10;
        }
        List<Double> list =  new ArrayList<>();
        list.add(sum);
        list.add(nonsum);
        Double[] arr=list.toArray(new Double[list.size()]);
        return arr;



    }
}


