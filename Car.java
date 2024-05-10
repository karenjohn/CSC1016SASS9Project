/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/

// Car class that inherits from the Vehicle class
public class Car extends Vehicle{
 // Instance variables
  private double weight;
  private int capacity;
  
  // Class constructor
  public Car(int numCylinders, String maker, Student owner, int passengers, double carWeight){
    //Inheriting form the base class
    super(numCylinders,maker,owner);
    capacity = passengers;
    weight = carWeight;
  }
  
  // Copy constructor
  public Car(Car C){
    super(C);
    capacity = C.capacity;
    weight = C.weight;
  }
  
  // Overriding the toStirng method from the base class
  @Override
  public String toString(){
    return super.toString() + "\n" + "The car is a " + capacity + "-seater weighing " + weight + " kg";
  }
}