public class swappingvariablesbitwise{
    public static void main(String[] arg){
        int a=5;
        int b=15;
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a = " + a + ", b = " + b);
    }
}