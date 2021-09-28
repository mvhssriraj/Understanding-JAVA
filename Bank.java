import java.lang.*;
import java.io.*;
import java.util.*;
public class Bank
{
    Bank()
    {
        System.out.println("Bank Account is created");
    }
    
    private int acc_no;
    private String name;
    private String acc_type;

    Bank(int i)
    {
        acc_no = i;
    }

    Bank(int i,String t)
    {
        acc_no = i;
        name = t;
    }

    Bank(int i,String t,String p)
    {
        acc_no = i;
        name = t;
        acc_type = p;
    }

    void display()
    {
        System.out.println(acc_no +" "+name+" "+acc_type);
    }

    public static void main(String[] args)
    {
        Bank b1 = new Bank(1207);
        Bank b2 = new Bank(1207,"Narayan");
        Bank b3 = new Bank(1207,"Narayan","Savings");
        b1.display();
        b2.display();
        b3.display();

    }
}