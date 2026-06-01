public class numberguessinggame {
    public static void main(String[] args) {
        int numberToGuess = 42; // You can change this to any number you want
        int userGuess = 0; // This will hold the user's guess

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number!");
            }
        }

        scanner.close();
    }
}
