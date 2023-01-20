import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Insertsort {
    public static void main(String[] args) throws Exception{
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str  =bfReader.readLine().split(",") ;
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
