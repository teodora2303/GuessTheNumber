import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

Scanner scanner = new Scanner(System.in);
    int number = (int)(Math.random() * 100) + 1;
    int trials = 5;
    int guess;

        System.out.println("Guess the number (1 - 100)");

        for (int i = 0; i < trials; i++) {
            guess = scanner.nextInt();

            if (number == guess) {
                System.out.println("Congratulation!");
                break;

            }else if (guess > number) {
                System.out.println("the number is less then " + guess);
            } else  {
                System.out.println("the number is greater then " + guess);
            }

        }

        System.out.println("You have exhausted " + trials + " trials");
        System.out.println("the number was: " + number);


}
}