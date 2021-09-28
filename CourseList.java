import static java.lang.System.out;

import java.util.Scanner;

public class CourseList{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        out.println("Welcome to Vellore Institute Of Technology ,Chennai");
        int regno[]=new int [10];
        String name[]=new String[10];
        int choice[]=new int[10];
        int c1=0,c2=0,c3=0;

        for(int i=0;i<5;i++)
        {
            regno[i]=sc.nextInt();
            name[i]=sc.next();
            out.println("Enter the number of your elective subject as shown below:");
            out.println("1. CSE 4001 - Digital Forensics");
            out.println("2. CSE 1007 - Java Programming ");
            out.println("3. CSE 1004 - Networks and Communications");
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
            else
            {
                out.println("You didn't enter a valid choice");
            }

        }
        out.println("Choice 1 : CSE 4001 - Digital Forensics");
        for(int i=0;i<5;i++)
        {
            if(choice[i]==1)
            out.println(regno[i] + name[i]);
        }
        out.println("Choice 2 : CSE 1007 - Java Programming");
        for(int i=0;i<5;i++)
        {
            if(choice[i]==2)
            out.println(regno[i] + name[i]);
        }
        out.println("Choice 3 : CSE 1004 - Networks and Communications");
        for(int i=0;i<5;i++)
        {
            if(choice[i]==3)
            out.println(regno[i] + name[i]);
        }

    }
}
