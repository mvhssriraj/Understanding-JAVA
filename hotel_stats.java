import static java.lang.System.out;
import java.util.*;
public class hotel_stats
{
    String name;
    String emp_no;
    String dessert;
    String starter;
    String maincourse;
    
    

    public void get()
    {
        Scanner sc = new Scanner(System.in);
        name=sc.next();
        emp_no=sc.next();
        System.out.println("The desserts for today");
        System.out.println("1.dessert1 2.dessert2 3.dessert3");
        dessert=sc.next();
        System.out.println("The starter for today");
        System.out.println("1.starter1 2.starter2 3.starter3");
        starter=sc.next();
        System.out.println("The maincourse for today");
        System.out.println("1.mc1 2.mc2 3.mc3");
        maincourse=sc.next();  
        
    }
    

    public static void main(String[] args)
    {
        hotel_stats ob[] = new hotel_stats[20];
        int d1=0,d2=0,d3=0;
        int s1=0,s2=0,s3=0;
        int mc1=0,mc2=0,mc3=0;
        for(int i=0;i<5;i++)
        {
            ob[i]=new hotel_stats();
            ob[i].get();  
        }
        for(int i=0;i<5;i++)
        {
            

            if(ob[i].maincourse.equals("mc1"))
            {
                mc1=mc1+1;
            }
            if(ob[i].maincourse.equals("mc2"))
            {
                mc2=mc2+1;
            }
            if(ob[i].maincourse.equals("mc3"))
            {
                mc3=mc3+1;
            }

            

            if(ob[i].starter.equals("starter1"))
            {
            s1=s1+1;
            }
            if(ob[i].starter.equals("starter2"))
            {
            s2=s2+1;
            }
            if(ob[i].starter.equals("starter3"))
            {
            s3=s3+1;
            }
            
            if(ob[i].dessert.equals("dessert1"))
            {
            d1=d1+1;
            }
            if(ob[i].dessert.equals("dessert2"))
            {
            d2=d2+1;
            }
            if(ob[i].dessert.equals("dessert3"))
            {
            d3=d3+1;
            }
        }
        if(s1>s2 && s1>s3)
        {
            System.out.println("s1 choosen"); 
        }
        if(s2>s1 && s2>s3)
        {
            System.out.println("s2 choosen"); 
        }
        if(s3>s1 && s3>s2)
        {
            System.out.println("s3 choosen"); 
        }
        if(d1>d2 && d1>d3)
        {
            System.out.println("d1 choosen"); 
        }
        if(d2>d1 && d2>d3)
        {
            System.out.println("d2 choosen"); 
        }
        if(d3>d1 && d3>d2)
        {
            System.out.println("d3 choosen"); 
        }
        if(mc1>mc2 && mc1>mc3)
        {
            System.out.println("mc1 choosen"); 
        }
        if(mc2>mc1 && mc2>mc3)
        {
            System.out.println("mc2 choosen"); 
        }
        if(mc3>mc1 && mc3>mc2)
        {
            System.out.println("mc3 choosen"); 
        }
        
    }
}