package EcaterinaWeek3;

public class ArmstrongNumbers {

    //  Write a method that can check if a number is Armstrong number

    /*
    An Armstrong number is one whose sum of digits raised to the power three equals the number itself. 371, for example, is an Armstrong number because 3**3 + 7**3 + 1**3 = 371.
     */

    public static void armstrongNumber(int n){

        String[] temp = String.valueOf(n).split("");
        int[] nums = new int[temp.length];
        int sum = 0;

        for(int i = 0; i < temp.length; i++){
            nums[i] = Integer.parseInt(temp[i]);
            sum += nums[i]*nums[i]*nums[i];
        }

        if(sum == n){
            System.out.println(n + " is an armstrong number");
        } else {
            System.out.println(n + " is not an armstrong number");
        }

    }

    public static void main(String[] args) {
        armstrongNumber(371);
    }
}
