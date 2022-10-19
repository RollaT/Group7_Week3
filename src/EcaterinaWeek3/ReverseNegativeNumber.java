package EcaterinaWeek3;

public class ReverseNegativeNumber {

    // Write a return method that can reverse negative number and return it as int

    public static int reverseNegativeNumber(int n) {


        n = n * -1;
        String[] temp = String.valueOf(n).split("");
        String[] reverse = new String[temp.length];

        for (int i = temp.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = temp[i];
        }

        String result = "";

        for(int i = 0; i < reverse.length; i++){
            result += reverse[i];
        }

        return Integer.parseInt(result) * -1;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-23));
    }

}
