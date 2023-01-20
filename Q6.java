import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Q6 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String inp  = read.readLine();
        int[] minint=Arrays.stream(inp.substring(0, inp.length()).split(","))
        .map(String::trim).mapToInt(Integer::parseInt).toArray();
        Integer[] maxint =Arrays.stream(minint).boxed().toArray(Integer[]::new);
        Arrays.sort(minint);
        String[] min=Arrays.stream(minint)
        .mapToObj(String::valueOf)
        .toArray(String[]::new);
        Arrays.sort(maxint,cmp);
        String[] max=Arrays.stream(maxint)
        .map(String::valueOf)
        .toArray(String[]::new);
        String minstr = Arrays.stream(min).collect(Collectors.joining());
        String maxstr = Arrays.stream(max).collect(Collectors.joining());
        int minnum=Integer.valueOf(minstr);
        int maxnum=Integer.valueOf(maxstr);
        int dif=maxnum-minnum;
        System.out.println("最大與最小相差"+dif);
        System.out.println(minstr);
        System.out.println(maxstr);
        /*
        int minnum=Integer.valueOf(min);
        int maxnum=Integer.valueOf(max);
        int dif=maxnum-minnum;
        System.out.println("最大與最小相差"+dif);
        */
    }
    static Comparator<Integer> cmp= new Comparator<Integer>()
    {
        public int compare(Integer a, Integer b){
            return b-a;
        }
    };


}