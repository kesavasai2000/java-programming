import java.util.*;

public class numberinwords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String res1 = "";
        String res2 = "";

        int units = a % 10;
        int tens = a / 10;

        switch (units) {
            case 1:
                res1 += "one";
                break;
            case 2:
                res1 += "two";
                break;
            case 3:
                res1 += "three";
                break;
            case 4:
                res1 += "four";
                break;
            case 5:
                res1 += "five";
                break;
            case 6:
                res1 += "six";
                break;
            case 7:
                res1 += "seven";
                break;
            case 8:
                res1 += "eight";
                break;
            case 9:
                res1 += "nine";
                break;
            case 0:
                res1 += "";
                break;
            default:
                res1 += "Invalid";
                break;
        }

        switch (tens) {
            case 1:
                res2 += "ten";
                if (units == 1) res2 = "eleven";
                else if (units == 2) res2 = "twelve";
                else if (units == 3) res2 = "thirteen";
                else if (units == 4) res2 = "fourteen";
                else if (units == 5) res2 = "fifteen";
                else if (units == 6) res2 = "sixteen";
                else if (units == 7) res2 = "seventeen";
                else if (units == 8) res2 = "eighteen";
                else if (units == 9) res2 = "nineteen";
                res1 = ""; // Clear units for special teen cases
                break;
            case 2:
                res2 = "twenty";
                break;
            case 3:
                res2 = "thirty";
                break;
            case 4:
                res2 = "forty";
                break;
            case 5:
                res2 = "fifty";
                break;
            case 6:
                res2 = "sixty";
                break;
            case 7:
                res2 = "seventy";
                break;
            case 8:
                res2 = "eighty";
                break;
            case 9:
                res2 = "ninety";
                break;
            case 0:
                res2 = "";
                break;
            default:
                res2 = "Invalid";
                break;
        }

        String res = res2 + res1;
        System.out.println(res);
    }
}
