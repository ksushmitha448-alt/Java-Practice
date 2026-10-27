package Basics;
import java.util.*;
public class Functions {
    public static void printMyName(String name){ //function declare
        System.out.println(name + " wellcome to java");
        return;
    }
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("enter your name:");
        String name=scan.next();

        printMyName(name);    //function call

        scan.close();

    }
    
}
