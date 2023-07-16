import java.util.*;

class Guessnumber {

    public static void main(String args[]) {
        Random rad = new Random();
        int radnumber = rad.nextInt(100) + 1;
        System.out.println("Enter your guess number between 1 to 100 ");

        Scanner in = new Scanner(System.in);
        int a = 5;
        System.out.println("You have 5 Attempts to guess the number");

        while (true) {
            int guessnumber = in.nextInt();
            if (guessnumber <= 100 && guessnumber > 0) {
                if (a == 1) {
                    break;
                } else if (radnumber == guessnumber) {
                    System.out.println("Correct! You Win !");
                    break;

                } else if (radnumber > guessnumber) {
                    System.out.println("Nope! The number is higher. Guess again!");

                } else {

                    System.out.println("Nope! The number is lower. Guess again!");
                }
                a--;

            }

            else {
                System.out.println("Enter the number between 1 and 100");
            }

        }

    }
}