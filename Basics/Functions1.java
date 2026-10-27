package Basics;
import java.util.*;
public class Functions1 {
    public static int CaluculateSum(int a, int b){
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int sum=CaluculateSum(15,86);
        System.out.println("sum of two numbers:"+ sum);

        scan.close();

    }
    
}
