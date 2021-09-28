import java.util.*;public class AddFunction {
    public AddFunction()
    {
        System.out.println("Inside Default Constructor \n...");
    }
    public AddFunction(int x, int y)
    {
        System.out.println("Value is : "+(x+y));
        add();
    }
    public AddFunction(double x, double y)
    {
    }
    public static void add()
    {
    int a=5, b=10;
    int sum=a+b;
    System.out.println("SUM : "+sum);
    AddFunction ob2 = new AddFunction();
    ob2.sub();
    }
    public void sub()
    {
        int a=5, b=10;
        int dif=a-b;
        System.out.println("Difference : "+dif);
    }
    public static void main(String[] args)
    {
    AddFunction ob = new AddFunction();
    new AddFunction(3,4);
    new AddFunction(2.5,3.5);
    add();
    ob.sub();
    }
}