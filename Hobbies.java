import static java.lang.System.out;
import java.util.*;
public class Hobbies
{
    String name;
    String reading_book;
    String watching_mve;
    String dancing;
    String sport;

    public void get()
    {
        Scanner sc = new Scanner(System.in);
        name=sc.next();
        System.out.println("Do you like to read book");
        reading_book=sc.next();
        System.out.println("Do you like to watch Movie");
        watching_mve=sc.next();
        System.out.println("Do you like to dance");
        dancing=sc.next();
        System.out.println("Do you like to play sport games");
        sport=sc.next();
    }
    void chk1()
    {
        if(reading_book.equals("yes") && sport.equals("yes"))
        {
//             System.out.println(" "+name);
            print_name(name);
        }
    }
    void chk2()
    {
        if(reading_book.equals("yes") && watching_mve.equals("yes"))
        {
//             System.out.println(" "+name);
            print_name(name);
        }
    }
    void chk3()
    {
        if(reading_book.equals("no") && watching_mve.equals("yes") && sport.equals("no") && dancing.equals("no"))
        {
//             System.out.println(" "+name);
            print_name(name);
        }
    }
    void print_name(name)
    {
        System.out.println(" "+name);
    }
    
    public static void main(String[] args)
    {
        Hobbies ob[] = new Hobbies[20];
        for(int i=0;i<5;i++)
        {
            ob[i]=new Hobbies();
            ob[i].get();  
        }
        System.out.println("names of the candidates who like to read books and sports");
        for(int i=0;i<5;i++)
        {
            
            ob[i].chk1();
            

        }
        System.out.println("names of the candidates who like to read books and watch mve");
        for(int i=0;i<5;i++)
        {
            
            ob[i].chk2();
            

        }
        System.out.println("names of the candidates who like to watch mve nothing else");
        for(int i=0;i<5;i++)
        {
        
            ob[i].chk3();

        }

    }
}
