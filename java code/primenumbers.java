import java.util.*;

public class primenumbers {
    public static void main(String[] args) {
        System.out.print("Enter Prime numbers:  ");
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        int iterations=0;
         
        boolean[] PrimesArray = new boolean[input];

        for (int i = 0; i < PrimesArray.length; i++) {
            PrimesArray[i] = true;
        }
       
        for (int i = 2; i * i <PrimesArray.length; i++) {
            if (PrimesArray[i]) {
                for (int j = i * i; j < PrimesArray.length; j += i) {
                    PrimesArray[j] = false;
                    iterations++;
                }
            }
        }
        for (int i = 0; i < PrimesArray.length; i++) {
            if (PrimesArray[i]) {
                System.out.println(i);
            }
        }
    }
}
