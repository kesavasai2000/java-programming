import java.util.*;

public class perfectnumber{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int Sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
               Sum+=i;
                
         }        
            
        }
        if(Sum==n){
            System.out.println("perfect number");
        }
        else{
            System.out.println("nota perfect number");
        }
    }
}