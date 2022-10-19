package Week3;

import java.util.Scanner;

public class Class1 {
//Reverse Negatives
    //ethem is late here!
    public static void main(String[] args) {

        System.out.println("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverseTheNumber = reverseNumber(n);
        System.out.println("The reverse of the number is: " + reverseTheNumber);

    }

    public static int reverseNumber(int number){
        boolean isNotNegative = number < 0 ? true : false;
        if(isNotNegative){
            number = number * -1;
        }
        int reverse = 0;
        int lastdigit  = 0;
        while (number >= 1){
            lastdigit = number % 10;
            reverse = reverse * 10 + lastdigit;
            number = number / 10;
        }
        return  isNotNegative == true? reverse*-1 : reverse;
    }
}
