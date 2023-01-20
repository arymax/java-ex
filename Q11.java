import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Q11 {
    public static void main(String[] args) throws Exception {
        String[] z={"Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn"};
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inp  = bfReader.readLine().split(" ");
        int month=Integer.valueOf(inp[0]);
        int day=Integer.valueOf(inp[1]);
        System.out.println("星座為"+z[get(month,day)]);

    }

    public static int get(int month,int day) {
        int temp=0;
        if(month==1||month==3||month==4)
        {
            if(day>21)
            {
                temp= month-1;
            }
            else
            {temp= month-2;}
        }
        if(month==5||month==6||month==12)
        {
            if(day>22)
            {
                temp= month-1;
            }
            else
            {temp= month-2;}

        }
        if(month==7||month==11)
        {
            if(day>23)
            {
                temp= month-1;
            }
            else
            {temp= month-2;}

        }
        if(month==8||month==9||month==10)
        {
            if(day>24)
            {
                temp= month-1;
            }
            else
            {temp= month-2;}

        }
        if(month==2)
        {
            if(day>19)
            {
                temp= month-1;
            }
            else
            {temp= month-2;}

        }

        return temp;
    }

}