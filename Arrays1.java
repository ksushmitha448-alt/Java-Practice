import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args){
    
        Scanner scan=new Scanner (System.in);
        System.out.println("enter the size of the array");
        int size=scan.nextInt();
        int number[]= new int [size];

        System.out.println("enter the elements of array to store:");
        for(int i=0; i<size; i++){
            number[i]=scan.nextInt();
        }
        
        System.out.println("enter a number to search:");
        int x=scan.nextInt();
        for( int i=0; i<number.length; i++){
            if(number[i]== x){
                System.out.println("x found at the location: "+ i);
            }
        }    
        System.out.println("invalid element!! please enter a stored element");
        
        scan.close();
}
}
