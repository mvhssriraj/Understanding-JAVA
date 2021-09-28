import java.lang.*;
import java.util.*;
public class switchcase_stringtest {
    public static void main(String[] argv)
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer str=new StringBuffer();
        str.append(sc.nextLine());
        str.reverse();
        str.delete(1,3);
        str.append("world");
        str.append("world--",2,5);  
        System.out.println(str);
        String branch="SCOPE";
        String duration="ME";
        String array[]={"apple","cat","ball","samsung","cars","abv"};
        Arrays.sort(array);
        for(int i=0;i<6;i++)
        {
            System.out.println("The word "+i+" is"+array[i]);

        }


        switch(branch)
        {
            case "SCOPE":
                System.out.println("the branch is Computer Science");
                switch(duration)
                {
                    case "BE":
                        System.out.println("it's a 4 year course");
                        break;
                    case "ME":
                        System.out.println("It's a 2 year course"); 
                        break;
                    default:
                        System.out.println("Enjoy");
                    
                }
                break;
            default:
                System.out.println("enjoy branch");
        }
    }
}
