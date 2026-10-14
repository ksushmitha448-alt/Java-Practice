import java.util.*;
public class Functions2 {
    public static void printFactorial(int n){
        if(n<1){
            System.out.println("invalid number");
            return ;
        }

        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial= factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("enter a number:");
        int n=scan.nextInt();

        printFactorial(n);

        scan.close();


    }
}
