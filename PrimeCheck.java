import java.util.*;
public class primecheck{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        if(n<=0){
            System.out.print("It is not a Prime number");
            return;
        }
          for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print("It is not a prime number");
                return ;
            }
        }
        System.out.print("It is a Prime number");
       }
}
