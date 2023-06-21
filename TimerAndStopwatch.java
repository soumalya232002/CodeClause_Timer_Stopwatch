import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerAndStopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Timer example
        System.out.print("Enter the number of seconds for the timer: ");
        int seconds = scanner.nextInt();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time's up!");
                timer.cancel();
            }
        }, seconds * 1000);

        // Stopwatch example
        System.out.println("Press enter to start the stopwatch...");
        scanner.nextLine(); // consume the enter key
        long startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started.");
        System.out.println("Press enter to stop the stopwatch...");
        scanner.nextLine(); // consume the enter key
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Stopwatch stopped.");
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
    }
}
