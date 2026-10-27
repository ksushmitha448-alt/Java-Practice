package Basics;
import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter button between(1-3):");
        int button=scan.nextInt();

        switch (button) {
            case 1:System.out.println("Hello");
            break;
        
            case 2:System.out.println("Namaste");
            break;

            case 3:System.out.println("Onakam");
            break;

            default:System.out.println("inavalid choice !!");
        }
        scan.close();

    }    
    
}
