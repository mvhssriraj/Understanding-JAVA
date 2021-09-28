/*
Write a program to store the survey results into an array of type household_t.  Then perform the following:

Calculate the average household income and list the identification number and income of each household whose income exceeds the average.
Determine the percentage of households having incomes below the poverty level. Poverty level income is computed using the formula,
P=$7500.00 + $950.00 x ( m-2 )
where ‘m’ is the number of members of each household.*/

import static java.lang.System.out;
import java.util.Scanner;
public class household_t{

    int id_no;
    float income;
    float members;
    float pline;
    float avg_income;

    public void get()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id_no:");
        id_no=sc.nextInt();
        System.out.print("Enter Income:");
        income=sc.nextFloat();
        System.out.print("Enter the number of members:");
        members=sc.nextFloat();

    }
    public void pcalc()
    {
        pline=7500 + 950*(members-2);
    }
    public void avg_income_calc()
    {
        avg_income=income/members;
    }
    public static void main(String[] args)
    {
        household_t ob[]=new household_t[20];
        Scanner sc = new Scanner(System.in);
        float n;
        float count=0;
        float percentage;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ob[i]=new household_t();
            ob[i].get();
            ob[i].pcalc();
            ob[i].avg_income_calc();
        }
        
        for(int i=0;i<n;i++)
        {
            if(ob[i].pline>=ob[i].avg_income)
            {
                System.out.println("this id pay is above average income: "+ob[i].id_no);
            }
            if(ob[i].income<ob[i].pline)
            {
                count = count +1;
            }
        }
        System.out.println("The number of ids below poverty:"+count);
        percentage= (count/(n))*100;
        System.out.println("The poverty percentage:"+percentage);
    }
}