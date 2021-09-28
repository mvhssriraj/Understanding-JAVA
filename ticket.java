
import static java.lang.System.out;
import java.util.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ticket {
    int t1p=100;
    int t2p=200;
    int t3p=300;
    int t4p=400;
    String ticket;
    int money;

    public void get()
    {
        Scanner sc = new Scanner(System.in);
        ticket=sc.next();
    }
    public void getprice()
    {
        if(ticket.equals("t1"))
        {
            System.out.println("Your ticket price is Rs. 100.00");
        }
        if(ticket.equals("t2"))
        {
            System.out.println("Your ticket price is Rs. 200.00");
        }
        if(ticket.equals("t3"))
        {
            System.out.println("Your ticket price is Rs. 300.00");
        }
        if(ticket.equals("t4"))
        {
            System.out.println("Your ticket price is Rs. 400.00");
        }
    }
    public void get_balance()
    {
        int balance=0;
        if(ticket.equals("t1"))
        {
            balance=money-100;
        }
        else if(ticket.equals("t2"))
        {
            balance=money-200;
        }
        else if(ticket.equals("t3"))
        {
            balance=money-300;
        }
        else if(ticket.equals("t4"))
        {
            balance=money-400;
        }
        System.out.println("Your Balance is: "+balance);
        System.out.println("Thanking for booking from our website!! Happy Journey");
        
    }
    public void insertMoney()
    {
        System.out.println("Enter the amount you have inserted");
        Scanner sc = new Scanner(System.in);
        money=sc.nextInt();
        if(ticket.equals("t1"))
        {
            int balance=0;
            if(money==100)
            {
                System.out.println("The amount is entered correct payment Successful:)");
            }
            else if(money<100)
            {
                System.out.println("Sorry Money insufficient :: pls try again");
                money=sc.nextInt();
                if(money<100)
                {
                System.out.println("Again the entered amount is insufficient:: Payment terminated");
                }
                else if(money==100)
                {
                    System.out.println("The amount is entered correct payment Successful:)");
                }
                else if(money>100)
                {
                    System.out.println("checking for balance");
                    get_balance();
                }
            }
            else if(money>100)
            {
                System.out.println("checking for balance");
                get_balance();
            }
        }
        if(ticket.equals("t2"))
        {
            int balance=0;
            if(money==200)
            {
                System.out.println("The amount is entered correct payment Successful:)");
            }
            else if(money<200)
            {
                System.out.println("Sorry Money insufficient :: pls try again");
                money=sc.nextInt();
                if(money<200)
                {
                System.out.println("Again the entered amount is insufficient:: Payment terminated");
            
                }
                else if(money==200)
                {
                    System.out.println("The amount is entered correct payment Successful:)");
                }
                else if(money>200)
                {
                    System.out.println("checking for balance");
                    get_balance();
                }
            }
            else if(money>200)
            {
                System.out.println("checking for balance");
                get_balance();
            }
        }
        if(ticket.equals("t3"))
        {
            int balance=0;
            if(money==300)
            {
                System.out.println("The amount is entered correct payment Successful:)");
            }
            else if(money<300)
            {
                System.out.println("Sorry Money insufficient :: pls try again");
                money=sc.nextInt();
                if(money<300)
                {
                System.out.println("Again the entered amount is insufficient:: Payment terminated");
          
                }
                else if(money==300)
                {
                    System.out.println("The amount is entered correct payment Successful:)");
                }
                else if(money>300)
                {
                    System.out.println("checking for balance");
                    get_balance();
                }
            }
            else if(money>300)
            {
                System.out.println("checking for balance");
                get_balance();
            }
        }
        if(ticket.equals("t4"))
        {
            int balance = 0;
            if(money==400)
            {
                System.out.println("The amount is entered correct payment Successful:)");
            }
            else if(money<400)
            {
                System.out.println("Sorry Money insufficient :: pls try again");
                money=sc.nextInt();
                if(money<400)
                {
                System.out.println("Again the entered amount is insufficient:: Payment terminated");
               
                }
                else if(money==400)
                {
                    System.out.println("The amount is entered correct payment Successful:)");
                }
                else if(money>400)
                {
                    System.out.println("checking for balance");
                    get_balance();

                }
            }
            else if(money>400)
            {
                System.out.println("checking for balance");
                get_balance();
            }
        }
    }

    public static void main(String[] args)
    {
        ticket ob[] = new ticket[20];
        for(int i=0;i<5;i++)
        {
            ob[i]=new ticket();
            ob[i].get();
            ob[i].getprice();
            ob[i].insertMoney(); 
        }

    }
}