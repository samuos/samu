import java.util.Scanner;

public class rom {
    static int conv(char c)
{
    int value = 0;
    switch (c)
    {
    case 'I':
        value = 1;
        break;
    case 'V':
        value = 5;
        break;
    case 'X':
        value = 10;
        break;
    case 'L':
        value = 50;
        break;
    case 'C':
        value = 100;
        break;
    case 'D':
        value = 500;
        break;
    case 'M':
        value = 1000;
        break;
    case '0':
        value = 0;
        break;
    default:
        value = -1;
    }
    return value;
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Roman number");
        String c=s.next().toUpperCase();
        int sum=0;
        sum=conv(c.charAt(0));
        for(int i=1;i<c.length();i++)
        {
            if(conv(c.charAt(i))>conv(c.charAt(i-1)))
            {
                sum-=2*conv(c.charAt(i-1));
                sum+=conv(c.charAt(i));
            }
            else
            {
                sum+=conv(c.charAt(i));
            }
        
        }
        System.out.println(sum);
        
    }
    
}
