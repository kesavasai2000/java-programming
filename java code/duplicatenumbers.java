import java.util.HashMap;

public class duplicatenumbers{
    public static void main(String[] args) {
        int[] array = {2,5,9,5};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int duplicateCount = 0;
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int freq : frequencyMap.values()) {
            if (freq > 1) {
                duplicateCount++;
            }
        }

        System.out.println("Number of duplicate elements: " + duplicateCount);

        
    }
}