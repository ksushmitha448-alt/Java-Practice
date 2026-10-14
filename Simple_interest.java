import java.util.Scanner;
public class Simple_interest
{
    public static void main(String[] args)
    {
        float p, t, r, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter p,t,r:");
        p=scan.nextFloat();
        t=scan.nextFloat();
        r=scan.nextFloat();

        result= (p* t* r)/100;
        System.out.println(result);
      
       scan.close(); 
    }


}
