import java.util.Scanner;

public class trillingzeros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=100;
        int sum=0;
        while(n>0){
            int q=n/5;
            sum+=q;
            n=q;


        }
        System.out.println(sum);
    }
}