import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    int a;
    int b;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public static class geter extends Main{
        int c;
        int d;

        void get()
        {
            Scanner sc = new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
        }
        void print()
    {
        System.out.println("The desired outs are : "+a +" and "+b+"and "+c +" and "+d);

    }

    }
    void print()
    {
        System.out.println("The desired outs are : "+a +" and "+b);

    }
    public static void main(String argv[])
    {

        //learn l=new learn();
        geter g=new geter();
        g.get();
        g.print();
        Main m= new Main();
        m.get();
        m.print();
        
    }

    
}

