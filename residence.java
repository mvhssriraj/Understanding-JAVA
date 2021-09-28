import java.lang.*;
import java.io.*;
import java.util.*;
import javax.lang.model.util.ElementScanner6;
public class residence
{
    String name;
    int block_no;
    int flat_no;
    String mobile_no;
    int balance_amt=5000;

    public static void main(String[] args)
    {
        residence ob[] = new residence[20];
        Scanner sc = new Scanner(System.in);
        residence sample=new residence();
        ob[0]=new residence();
        ob[1]=new residence();
        ob[2]=new residence();
        ob[3]=new residence();
        ob[4]=new residence();
        ob[0].name="sriraj";
        ob[1].name="madan";
        ob[2].name="harish";
        ob[3].name="gautam";
        ob[4].name="rogan";
        ob[0].block_no=2;
        ob[1].block_no=3;
        ob[2].block_no=3;
        ob[3].block_no=2;
        ob[4].block_no=1;
        ob[0].flat_no=5;
        ob[1].flat_no=4;
        ob[2].flat_no=2;
        ob[3].flat_no=2;
        ob[4].flat_no=1;
        ob[0].mobile_no="+91 9448999172";
        ob[1].mobile_no="+91 7893917281";
        ob[2].mobile_no="+1 888 999 258";
        ob[3].mobile_no="+41 456789789";
        ob[4].mobile_no="+258 4884884885";
        System.out.println("Enter your details to know your balance:");
        sample.name=sc.next();
        sample.block_no=sc.nextInt();
        sample.flat_no=sc.nextInt();
        sample.balance_amt=000;
        int chk;
        int chk_update;
        int amount;
        //System.out.println("the sample name is:"+sample.name);
        //System.out.println("the sample block no is:"+sample.block_no);
        //System.out.println("the sample apla is:" +sample.flat_no);

        for(int i=0;i<2;i++)
        {
            if((ob[i].name.equals(sample.name))&&(ob[i].block_no==sample.block_no) && (ob[i].flat_no==sample.flat_no) )
            {
                System.out.println("Your Balance amount is: "+ob[i].balance_amt);
                System.out.println("Do you want to pay the balance amount Yes=1 No=0");
                chk=sc.nextInt();
                if(chk==1)
                {
                    System.out.println("Enter the amount:");
                    amount=sc.nextInt();
                    if(amount==ob[i].balance_amt)
                    {
                        System.out.println("Payment done successfull");
                        ob[i].balance_amt=000;

                    }
                    else if(amount<ob[i].balance_amt)
                    {
                        System.out.println("Still you have due to be paid");
                        ob[i].balance_amt=ob[i].balance_amt-amount;
                        System.out.println("Due amount left is : "+ob[i].balance_amt);
                    }
                    else if(amount>ob[i].balance_amt)
                    {
                        System.out.println("Payement done successfull.");
                        amount=amount-ob[i].balance_amt;
                        System.out.println("Take your balance"+amount);

                    }
                    System.out.println("Do you want to update your personal information");
                    System.out.println("terminate=0 update_mobile.no=1 update_name=2");
                    chk_update=sc.nextInt();
                    if(chk_update==0)
                    System.out.println("Thank you for your response.");
                    else if(chk_update==1)
                    {
                        String new_mob;
                        System.out.println("Enter your new mobile no.");
                        new_mob=sc.next();
                        ob[i].mobile_no=new_mob;
                        System.out.println("Mobile no. changed successfully");
                        System.out.println("Your updated details are as follows:");
                        System.out.println("Name:"+ob[i].name);
                        System.out.println("block_no:"+ob[i].block_no);
                        System.out.println("Flat no:"+ob[i].flat_no);
                        System.out.println("Mobile no:"+ob[i].mobile_no);

                    }
                    else if(chk_update==2)
                    {
                        String new_name;
                        System.out.println("Enter your new name");
                        new_name=sc.next();
                        ob[i].name=new_name;
                        System.out.println("name changed successfully");
                        System.out.println("Your updated details are as follows:");
                        System.out.println("Name:"+ob[i].name);
                        System.out.println("block_no:"+ob[i].block_no);
                        System.out.println("Flat no:"+ob[i].flat_no);
                        System.out.println("Mobile no:"+ob[i].mobile_no);

                    }

                }

            }

        }


    }
}