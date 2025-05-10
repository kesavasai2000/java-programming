public class exepction{
    public static void main(String[] args){
        int n1=24;
        int n2=0;
        int div=0;

        try{
            div=n1/n2;

        }catch(ArithmeticException c){
            System.out.println("Don't divide by zero");
            c.printStackTrace();

        }
        finally{
            System.out.println("we can't print the error value");
        }
        System.out.println(div);
       
        
    }
}