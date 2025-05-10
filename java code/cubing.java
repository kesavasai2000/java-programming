import java.util.*;
public class cubing{
    public static void main(String[] args) {
        double number=28;
        double root=3;
        
       double left= 0;
       double rigth = number;
       double middle = 0;
       double error = 0.0000000000001;
       while((rigth-left)>error){
        middle = (left+rigth)/2;
        if(multiply(middle,root)>number){
            rigth = middle;
            
        }




       }



    }
}
