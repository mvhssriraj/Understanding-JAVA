/*
[11:16] Hema N
The items chosen by age group 1-10 are color pencil, toys. Girls like color pencil and boys like toys.

[11:17] Hema N
The above is the kind of report needed to be displayed. Similarly for 11-30 and 31-50 age group also.

*/
import static java.lang.System.out;

import java.util.Scanner;

public class Favo_Item{
    //private static int nextInt;

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        out.println("Welcome to Orion Supermarket,Banglore");
        int age[]=new int [10];
        String name[]=new String[10];
        int gender[]=new int[10];
        int choice[]=new int[10];
        int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0;
        int a1=0,a2=0,a3=0;
        int g1=0,g2=0;

        for(int i=0;i<9;i++)
        {
            name[i]=sc.next();
            age[i]=sc.nextInt();
            out.println("Enter the gender");
            out.println("1. Male");
            out.println("2. Female");
            gender[i]=sc.nextInt();
            if(gender[i]==1)
            {
                g1=g1+1;
            }
            if(gender[i]==1)
            {
                g2=g2+1;
            }
            out.println("Enter the giftcode of your choice you want to receive from us:");
            out.println("1. ColourPencil");
            out.println("2. Pen");
            out.println("3. Diary");
            out.println("4. Kettel");
            out.println("5. Toys");
            out.println("6. Umbrella");
            out.println("7. Socks");
            out.println("8. Coolers");
            choice[i]=sc.nextInt();
            if(choice[i]==1)
            {
                c1=c1+1;
            }
            else if(choice[i]==2)
            {
                c2=c2+1;
            }
            else if(choice[i]==3)
            {
                c3=c3+1;
            }
            else if(choice[i]==4)
            {
                c4=c4+1;
            }
            else if(choice[i]==5)
            {
                c5=c5+1;
            }
            else if(choice[i]==6)
            {
                c6=c6+1;
            }
            else if(choice[i]==7)
            {
                c7=c7+1;
            }
            else if(choice[i]==8)
            {
                c8=c8+1;
            }
            else
            {
                out.println("You didn't enter a valid choice");
            }

        }
        out.println("Age group of < 10 years choosen items");
        for(int i=0;i<9;i++)
        {
            if(age[i]<=10)
            {
                if(choice[i]==1)
                out.println(name[i]+ " has choosen ColourPencil as  a gift" );
                if(choice[i]==2)
                out.println(name[i]+ " has choosen Pen as  a gift");
                if(choice[i]==3)
                out.println(name[i]+ " has choosen Diary as  a gift");
                if(choice[i]==4)
                out.println(name[i]+ " has choosen Kettel as  a gift");
                if(choice[i]==5)
                out.println(name[i]+ " has choosen Toys as  a gift");
                if(choice[i]==6)
                out.println(name[i]+ " has choosen Umbrella as  a gift");
                if(choice[i]==7)
                out.println(name[i]+ " has choosen Socks as  a gift");
                if(choice[i]==8)
                out.println(name[i]+ " has choosen coolers as  a gift");

            }

        }
        out.println("Age group of 11-30 years choosen items");
        for(int i=0;i<9;i++)
        {
            if(age[i]>10 && age[i]<31)
            {
                if(choice[i]==1)
                out.println(name[i]+ " has choosen ColourPencil as  a gift" );
                if(choice[i]==2)
                out.println(name[i]+ " has choosen Pen as  a gift");
                if(choice[i]==3)
                out.println(name[i]+ " has choosen Diary as  a gift");
                if(choice[i]==4)
                out.println(name[i]+ " has choosen Kettel as  a gift");
                if(choice[i]==5)
                out.println(name[i]+ " has choosen Toys as  a gift");
                if(choice[i]==6)
                out.println(name[i]+ " has choosen Umbrella as  a gift");
                if(choice[i]==7)
                out.println(name[i]+ " has choosen Socks as  a gift");
                if(choice[i]==8)
                out.println(name[i]+ " has choosen coolers as  a gift");

            }

        }
        out.println("Age group of >30 years choosen items");
        for(int i=0;i<9;i++)
        {
            if(age[i]>31)
            {
                if(choice[i]==1)
                out.println(name[i]+ " has choosen ColourPencil as  a gift" );
                if(choice[i]==2)
                out.println(name[i]+ " has choosen Pen as  a gift");
                if(choice[i]==3)
                out.println(name[i]+ " has choosen Diary as  a gift");
                if(choice[i]==4)
                out.println(name[i]+ " has choosen Kettel as  a gift");
                if(choice[i]==5)
                out.println(name[i]+ " has choosen Toys as  a gift");
                if(choice[i]==6)
                out.println(name[i]+ " has choosen Umbrella as  a gift");
                if(choice[i]==7)
                out.println(name[i]+ " has choosen Socks as  a gift");
                if(choice[i]==8)
                out.println(name[i]+ " has choosen coolers as  a gift");

            }

        }
    }
}