package Basics;
import java.util.Scanner;
class Circle
 {
    public static void main (String[] args)
    {
        double radius, Area;
        Scanner scan = new Scanner(System.in);

        System.out.print("enter radius of the circle :");
        radius=scan.nextDouble();
        Area= 3.142* radius *radius;
        System.out.println("Area of the circle:"+ Area);

        scan.close();
    }

}


    

