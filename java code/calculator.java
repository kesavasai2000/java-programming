import java.util.*;
public class calculator{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        while(c!=5)
        switch(c){
            case 1:
                System.out.println("Addition: ");
                break;
            case 2:
                System.out.println("Subtraction: ");
                break;
            case 3:
                System.out.println("Division: ");
                break;
            case 4:
                System.out.println("Multiplication: ");
                break;
            default:
                System.out.println("Exit");
                break;               
        }

        
    }
}