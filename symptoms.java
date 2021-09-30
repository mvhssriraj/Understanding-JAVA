import static java.lang.System.out;
import java.util.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class symptoms {
    String Symptom1;
    String Symptom2;
    String place;

    public void get()
    {
        Scanner sc = new Scanner(System.in);
        Symptom1=sc.next();
        Symptom2=sc.next();
        place=sc.next();
    }

    public void chk_health()
    {
        if(Symptom1.equals("fever")&&Symptom2.equals("headache"))
        {
            take_dolo()
//             System.out.println("Dolo 650 for 3 days (1-1-1)");
        }
        else if(Symptom1.equals("cold")&&Symptom2.equals("cough"))
        {
            take_cofdrop()
//             System.out.println("Cofdrop Z Syrup 5ml 3 times a day");
        }
        else
        {
            go_out()
//             System.out.println("Please visit your Doctor at City hOSpital of "+place);
        }
    }
    public void take_dolo()
    {
        System.out.println("Dolo 650 for 3 days (1-1-1)");
    }
    public void take_cofdrop()
    {
        System.out.println("Cofdrop Z Syrup 5ml 3 times a day");
    }
    public void go_out()
    {
        System.out.println("Please visit your Doctor at City hOSpital of "+place);
    }
        
    public static void main(String[] args)
    {
        symptoms ob[] = new symptoms[20];
        for(int i=0;i<5;i++)
        {
            ob[i]=new symptoms();
            ob[i].get();
            ob[i].chk_health();
        }

    }


}
