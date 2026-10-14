import java.util.Scanner;
public class Condition
{
    public static void main(String[] args)
    {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age:");
        age=scan.nextInt();
        if (age>18)
            System.out.println("adult");
        else
            System.out.println("not adult");

        scan.close();

    }
    
}
