package Eugene;

public class ReverseNumber {
    public static int reverseNegativeNumber (int num) {

        num = -1 * num;
        String numStr = "" + num;
        String[] numArr = numStr.split("");
        String result = "";

        for (int i = numArr.length - 1; i >= 0; i--) {
            result += numArr[i];
        }
        int reversedNumber = Integer.parseInt(result);

        return reversedNumber * (-1);
    }
}
