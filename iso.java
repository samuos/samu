import java.util.HashMap;
import java.util.Scanner;

public class iso {
    
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
    String a,b;
    int r=1;
    a=s.next().toLowerCase(); 
    b=s.next().toLowerCase();
    if(a.length()==b.length())
    {
        if(a.equalsIgnoreCase(b))
        {
            r=1;
            
        }
        else
        {
        HashMap<Character,Character> h=new  HashMap<Character,Character>();
        for(int i=0;i<a.length();i++)
        {
        if(!h.containsKey(a.charAt(i)))
        {
        h.put(a.charAt(i),b.charAt(i));
        }
        }
        
         for(int j=0;j<a.length();j++)
         {
         if(h.containsKey(a.charAt(j)))
         {
         if(b.charAt(j)!=h.get(a.charAt(j)))
         {
             r=0;
         }
         }
         }
        
        
        
        
        }
        
        
        
        
    }
    else
    {
        r=0;
    }
    
    if(r==1)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    }
  
    
    
}
