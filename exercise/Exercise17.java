enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

}

/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level myVar; 
        myVar=Level.MEDIUM;
        switch (myVar) {
            case LOW:
                System.out.println("This is Low Level");
                break;
            case MEDIUM:
                System.out.println("This is Medium Level");
                break;
            case HIGH:
                System.out.println("This is High Level");
                break;
            default:
                System.out.println("Out of range");
        }
    }
    // Write a switch statement to print the expected output.

}
