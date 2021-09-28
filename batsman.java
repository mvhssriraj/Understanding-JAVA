import static java.lang.System.out;
import java.util.Scanner;
public class batsman{
    int bcode;
    String bname;
    int innings,notout,runs;
    float batavg=0;

    public void calcavg()
    {
        batavg=runs/(innings-notout);
    }
    public void readdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bcode:");
        bcode=sc.nextInt();
        System.out.print("Enter name:");
        bname=sc.next();
        System.out.print("Enter innings:");
        innings=sc.nextInt();
        System.out.print("Enter nout:");
        notout=sc.nextInt();
        System.out.print("Enter Runs:");
        runs=sc.nextInt();
    }
    public void display()
    {
        System.out.println("The details of the batsman:");
        System.out.println("Name:"+bname);
        System.out.println("Bcode:"+bcode);
        System.out.println("Innings:"+innings);
        System.out.println("notout"+notout);
        System.out.println("Runs"+runs);
        System.out.println("Bating Avg:"+batavg);
    }
    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of Batsmans: ");
		n=sc.nextInt();
		batsman ob[]=new batsman[20];
		for (int i=0;i<n;i++)
		{
			ob[i]=new batsman();
			ob[i].readdata();
            ob[i].calcavg();
		}
        for(int i=0;i<n;i++)
        {
            ob[i].display();
        }
    }
}
