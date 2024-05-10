/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/
// Creating a class Vehicle
public class Vehicle{

// Instance variables
  private Student owner;
  private int cylinders;
  private String manufacturer;
 
  
 
  // Class constructor
  public Vehicle(int numCylinders, String maker, Student owner){
    cylinders = numCylinders;
    manufacturer = maker;
    this.owner = owner;
  } 
  
  // Copy constructor
  public Vehicle(Vehicle v){
     this(v.cylinders,v.manufacturer,v.owner);
  }
 
  // Method to return a string format of the class 
  public String toString(){
    return  manufacturer + ", " + cylinders + " cylinders, owned by " + owner.getName() + ", a " + owner.getAge() + "-year old " + owner.getGender() + " studying " + owner.getProgramOfStudy() + " at " + owner.getNameOfInstitution() + ". " + owner.getName() + " likes " + owner.getHobbies() + "."; 
  }
}