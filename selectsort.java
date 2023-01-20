import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class selectsort  {
    public static void main(String[] args) throws Exception{
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str  =bfReader.readLine().split(",") ;
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int min;
        int index = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            for(int j = i+1; j <= arr.length - 1; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if(index != i) {
                arr[index] = arr[i];
                arr[i] = min;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}


