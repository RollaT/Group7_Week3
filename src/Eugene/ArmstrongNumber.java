package Eugene;

public class ArmstrongNumber {
    public static boolean isArmstrong (int num) {

        String numStr = "" + num;
        int len = numStr.length();
        String[] arr = numStr.split("");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int multiple_3 = 0;
            multiple_3 += Math.pow(Integer.parseInt(arr[i]), len);
            sum += multiple_3;
        }
        return num == sum;
    }
}
