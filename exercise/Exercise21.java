/**
 * Expected Output:
 * Car: Tuut, tuut!
 * Tesla ModelX
 * Vehicle: Tuut, tuut, tuut!
 */
class Vehicle {
    protected String brand = "Tesla"; // Protected Vehicle attribute

    public void honk() { // Vehicle method
        System.out.println("Vehicle: Tuut, tuut, tuut!");
    }
}

// think about the relationship between Car and Vehicle
class Car extends Vehicle{
    private String modelName = "ModelY"; // Car attribute

    public void setModelName(String modelName){this.modelName = modelName;}

    public String getModelName(){return modelName;}

    @Override
    public void honk(){System.out.println("Car: Tuut, tuut!");}

    // Implement the getModelname() and setModelName()

    // and something else

}

class Exercise21 {
    public static void main(String[] args) {
        // Create a myCar object
        Car myCar = new Car();
        // Call the honk() method on the myCar object
        myCar.honk();
        // Display the value of the protected brand attribute (from the Vehicle class)
        // and the value of the modelName from the Car class
        myCar.setModelName("ModelX");
        System.out.println(myCar.brand + " " + myCar.getModelName());

        Vehicle myVehicle = new Vehicle();
        myVehicle.honk();
    }
}