import java.util.*;

public class armstrongnumber{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=Math.pow(digit, 3);
            n/=10;
        }
        if(sum==temp){ 
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}

