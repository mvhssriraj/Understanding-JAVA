import static java.lang.System.out;
import java.util.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Student_info{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String regno,name,Qualification,Gender,Address;
        int Age,date,month,year;
        String phoneno;
        out.println("Welcome to Vellore Institute Of Technology ,Chennai");
        System.out.print("Registration number : ");
        regno = sc.nextLine();
        System.out.print("Enter your name : ");
        name = sc.nextLine();
        System.out.print("Enter your Age : ");
        Age = sc.nextInt();
        System.out.print("Enter your dob in dd/mm/yyyy format : ");
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        System.out.println("Enter your Qualification : ");
        Qualification = sc.nextLine();
        System.out.print("Enter your Gender : ");
        Gender = sc.nextLine();
        System.out.print("Enter your phoneno : ");
        phoneno= sc.nextLine();
        System.out.print("Enter your Address : ");
        Address= sc.nextLine();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Registration number : " +regno);
        System.out.println("Student Name : "+name);
        System.out.println("Age : "+Age);
        System.out.print("date of birth in (dd/mm/yyyy) : "+date);
        System.out.print("/"+month);
        System.out.print("/"+year);
        System.out.println("Qualification :"+Qualification);
        System.out.println("Gender : "+Gender);
        System.out.println("phoneno : "+phoneno);
        System.out.println("Address : "+Address);
    }
}