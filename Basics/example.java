package Basics;
import java.util.*;
public class example {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        do{
        System.out.println("enter n:");
        int n =scan.nextInt();
        if(n % 10 == 0){
            break;
        }
        System.out.println(n);
    }while(true);

    scan.close();
    }
}
