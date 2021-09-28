
import static java.lang.System.out;
import java.util.*;
public class Electricity_Bill
{
    String name;
    int last_read;
    int present_read;
    int diff_read=0;

    public void get()
    {
        Scanner sc = new Scanner(System.in);
        name=sc.next();
        last_read=sc.nextInt();
        present_read=sc.nextInt();

    }

    public void display()
    {
        System.out.println("Customer name :"+name);
        System.out.println("Diffrenece read:"+diff_read);
    }
    
    public int difference_read()
    {
        diff_read=present_read-last_read;
        return diff_read;
    }
    public void calc()
    {
        if(diff_read<=100)
        {
            System.out.println("This Customer has less than 100 units shouldn't pay -> :"+name);
        }
        if(diff_read>100 && diff_read<=200)
        {
            double amount;
            diff_read=diff_read-100;
            amount=diff_read * 1.5;
            System.out.println("This Customer should pay -> :"+name);
            System.out.println("Amount"+amount);
        }
        if(diff_read>200 && diff_read<=500)
        {
            double amount;
            diff_read=diff_read-200;
            amount= 100*1.5 + diff_read * 3.0;
            System.out.println("This Customer should pay -> :"+name);
            System.out.println("Amount"+amount);
        }
        if(diff_read>500)
        {
            double amount;
            diff_read=diff_read-500;
            amount=100*1.5+300*3.0+diff_read * 6.6;
            System.out.println("This Customer should pay -> :"+name);
            System.out.println("Amount"+amount);
        }
    }



    public static void main(String[] args)
    {
        Electricity_Bill ob[] = new Electricity_Bill[20];
        for(int i=0;i<5;i++)
        {
            ob[i]=new Electricity_Bill();
            ob[i].get();  
        }
        for(int i=0;i<5;i++)
        {
            ob[i].difference_read();  
        }
        for(int i=0;i<5;i++)
        {
            ob[i].calc();  
        }

    }
}
