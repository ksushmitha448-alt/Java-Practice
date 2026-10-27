package Basics;
import java.util.Scanner;
public class example4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter an integer:");
        int n =scan.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    scan.close();
}

}
