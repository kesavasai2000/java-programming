public class comPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","fly","flow"};

        for (int i = 0; i < 3; i++) {
            String curString = arr[i];

            for (int j = i + 1; j < 3; j++) {
                String nextString = arr[j];
                int minLength = Math.min(curString.length(), nextString.length());
                StringBuilder commonPrefix = new StringBuilder();

                for (int k = 0; k < minLength; k++) {
                    if (curString.charAt(k) == nextString.charAt(k)) {
                        commonPrefix.append(curString.charAt(k));
                    } else {
                        break;
                    }
                }
                System.out.println("Common prefix between " + curString + " and " + nextString + " is: " + commonPrefix);
            }
        }
    }
}