import java.util.Scanner;

public class minits {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        String tim;
        int h,m,s,t;
        System.out.println("Enter the time1(HH:MM:SS)");
        tim=ss.next();
        h=(Integer.parseInt(tim.substring(0, 2)))*60*60;
        m=(Integer.parseInt(tim.substring(3, 5)))*60;
        s=(Integer.parseInt(tim.substring(6, 8)));
        t=h+m+s;
        
        System.out.println("Enter the time2(HH:MM:SS)");
        tim=ss.next();
        h=(Integer.parseInt(tim.substring(0, 2)))*60*60;
        m=(Integer.parseInt(tim.substring(3, 5)))*60;
        s=(Integer.parseInt(tim.substring(6, 8)));
        t=(h+m+s)-t;
        if(t<0)
        {
            t*=-1;
        }
        System.out.println("Difference: "+t);
    }
    
}
