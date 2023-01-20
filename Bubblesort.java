import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) throws Exception{
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str  =bfReader.readLine().split(",") ;
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
