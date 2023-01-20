import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
public class Q4 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String inp1  = read.readLine();
        int x=Integer.parseInt(inp1);
        String inp2  = read.readLine();
        int y=Integer.parseInt(inp2);
        get(x,y);


    }

    public static int get(int x,int y){
        if(x==0&&y==0)
        {
            System.out.println("位於原點");
        }
        if(x==0&&y!=0)
        {
            System.out.println("位於Y軸");
        }
        if(x!=0&&y==0)
        {
            System.out.println("位於X軸");
        }
        if(x>0&&y>0)
        {
            System.out.println("位於第一象限，離原點為根號"+String.valueOf(x*x+y*y));
        }
        if(x>0&&y<0)
        {
            System.out.println("位於第二象限，離原點為根號"+String.valueOf(x*x+y*y));
        }
        if(x<0&&y<0)
        {
            System.out.println("位於第三象限，離原點為根號"+String.valueOf(x*x+y*y));
        }
        if(x<0&&y>0)
        {
            System.out.println("位於第四象限，離原點為根號"+String.valueOf(x*x+y*y));
        }
        return 1;
    }

}