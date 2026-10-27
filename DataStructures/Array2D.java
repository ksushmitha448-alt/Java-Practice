package DataStructures;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of row and column:");
        int rows=scan.nextInt();
        int columns=scan.nextInt();
        System.out.println("enter the elements:");

        int numbers[][]=new int [rows][columns];

        
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){
                numbers[i][j]=scan.nextInt();
            }
        }

        System.out.println("enter a number to search:");
        int x=scan.nextInt();
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){
                if(numbers[i][j]== x){
                System.out.println("x found at the location: (" + i + ","+j+")");
            }
        }
        }    
        //output
        //for(int i=0; i<rows;i++){
          //  for(int j=0; j<columns;j++){
            //    System.out.print(numbers[i][j] + " ");
         //   }
        //}
        
        scan.close();
    }
    
}