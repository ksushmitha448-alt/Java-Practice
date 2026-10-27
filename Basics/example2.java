package Basics;
import java.util.*;
@SuppressWarnings("resource")
public class example2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        do{
        System.out.print("enter n:");
        int n =scan.nextInt();
        if(n % 10 == 0){
            continue;
        }
        System.out.println(n);
    }while(true);

    }
}
    
