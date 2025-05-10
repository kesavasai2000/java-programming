import java.util.*;
public class longestsubstring{

    public static void main(String [] args) {
        String input= "PWWKEW";

        int max = 0;
        int left = 0;

        HashMap<Character, Integer> position = new HashMap<>();

        for(int rigth = 0; rigth < input.length(); rigth++){
            char current = input.charAt(rigth);
            if(!position.containsKey(current)){
                position.put(current, rigth);


            }
            else{
                left=Math.max(left, position.get(current) +1);
                position.put(current,rigth);

            }
            max=Math.max(max,(rigth-left)+1);

        }
        System.out.println(max);

    }
   
}
