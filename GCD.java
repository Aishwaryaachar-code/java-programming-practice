import java.util.*;
public class GCD{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        while(a !=b){
            if(a>b){
                 a= a-b;
            }else{
                b=b-a;
            }
        }
        System.out.print("GCD is:"+ a);
        
    }
}
