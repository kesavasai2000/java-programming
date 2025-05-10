import java.util.*;

public class SortedInsert {
    public static void main(String[] args) {
        List<Integer> sortedList = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        sortedList.add(4);
        Collections.sort(sortedList);
        System.out.println(sortedList);


        
    }
}
