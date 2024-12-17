package ie.atu.warriormanager;

public class UtilMethods {

    // Method to display text with a typing effect
    public static void displayText(String text, int delay) {
        // Loop through each character of the string
        for (char c : text.toCharArray()) {
            System.out.print(c);  // Print one character at a time
            try {
                Thread.sleep(delay);  // Pause for the specified delay (in milliseconds) before printing the next character
            } catch (InterruptedException e) {
                // If the thread is interrupted 
                Thread.currentThread().interrupt();  // Reset the interruption status of the current thread
                System.err.println("Text display interrupted!");  // Print an error message
                return;  // Exit the method early if interrupted
            }
        }
        System.out.println();  // After printing all characters, print a newline to move to the next line
    }
}
