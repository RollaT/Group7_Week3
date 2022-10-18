package Week3;

import java.util.Scanner;

public class Class2 {

    //Armstrong Numbers

    public static void main(String[] args) {

        System.out.println("Enter a 3 digit number to check if it is an Armstrong number:");
        int number = new Scanner(System.in).nextInt();
        if(isArmStrong(number)){
            System.out.println("Number : " + number + " is an Armstrong number");

        }else{
            System.out.println("Number : " + number + " is not an Armstrong number");
        }

    }
    private  static boolean isArmStrong(int number){
        int result = 0;
        int original = number;
        while(number != 0){
            int remainder = number%10;
            result = result + remainder*remainder*remainder;
            number = number/10;


        }
        if(original == result){
            return true;
        }
        return false;
    }
}
