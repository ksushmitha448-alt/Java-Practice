package DataStructures;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        //int marks[]=new int[3];
        //marks[0]=97;
        //marks[1]=98;
        //marks[2]=99;

        //int marks[]={97,99,100};
        Scanner scan=new Scanner (System.in);
        System.out.println("enter the size of the array");
        int size=scan.nextInt();
        int number[]= new int [size];

        System.out.println("enter the elements of array to store:");
        for(int i=0; i<size; i++){
            number[i]=scan.nextInt();
        }
        
        System.out.println("the array elements are:");
        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }
        scan.close();
    }
    
}
