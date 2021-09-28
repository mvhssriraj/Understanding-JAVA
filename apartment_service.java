import java.util.*;
public class apartment_service {
	String residence_name;
	int block_no,flat_no, due_amount,maintainance_amt,amt_paid,choice;
	long mobile_number;
	public void get_resident_details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choice 1 : Display the due Amount");
	    System.out.println("Choice 2 : Pay the maintainance amount");
	    choice=sc.nextInt();
	    System.out.println("Enter the Resident Details : ");
		System.out.println("Enter the Residence Name : ");
		residence_name=sc.next();
		System.out.println("Enter the Block number : ");
		block_no=sc.nextInt();
		System.out.println("Enter the Flat number : ");
		flat_no=sc.nextInt();
		System.out.println("Enter the Mobile number : ");
		mobile_number=sc.nextLong();
	}
	public void display1()
	{
		Scanner sc=new Scanner(System.in);
		if (choice ==1) {
		System.out.println("Enter the due amount : ");
		due_amount=sc.nextInt();
		System.out.println(due_amount);
		}
	}
	public void display2()
	{
		Scanner sc=new Scanner(System.in);
		if (choice == 2) {
		System.out.println("Enter the amount paid : ");
		amt_paid=sc.nextInt();
		System.out.println("Enter the maintainance amount : ");
		maintainance_amt=sc.nextInt();
		int diff=maintainance_amt-amt_paid;
		System.out.println("Due amount is : "+diff);
		}
	}
	public void calc()
	{
		int diff=amt_paid-maintainance_amt;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of Residents : ");
		n=sc.nextInt();
		apartment_service ob[]=new apartment_service[100];
		for (int i=0;i<n;i++)
		{
			ob[i]=new apartment_service();
			ob[i].get_resident_details();
		}
		System.out.println("Display the choice 1 details:");
		for (int i=0;i<n;i++)
		{
			ob[i].display1();
		}
		System.out.println("Display the choice 2 details:");
		for (int i=0;i<n;i++)
		{
			ob[i].calc();
			ob[i].display2();
		}
	}

}