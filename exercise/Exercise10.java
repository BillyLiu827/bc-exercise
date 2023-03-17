/**
 * Expected Output: 8
 */
public class Exercise10 {
    private int x; // Create an instance attribute

    // Create a class constructor for the Main class
    public Exercise10() {
        // Set the value for the instance attribute x to expected output
    }

    public Exercise10(int x) {
        this.x = x;
    }

    public void setx (int x){this.x = x;}
    public static void main(String[] args) throws Exception {
        Exercise10 x = new Exercise10(8);
        
        x.setx(8);
        
        System.out.println(x.x);
        // Print the value of instance attribute
    }
}
