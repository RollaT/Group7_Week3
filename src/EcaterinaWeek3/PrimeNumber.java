package EcaterinaWeek3;

public class PrimeNumber {

    //   Write a method that can check if a number is prime or not


    public static boolean primeNumber(int num) {

        for (int i = 2; i < num; i++){ // starts with two because division by 0 is impossible and by one is useless
            if (num % i == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(primeNumber(24));
        System.out.println(primeNumber(23));

    }
}
