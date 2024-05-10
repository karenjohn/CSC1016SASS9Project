/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/

//Class Box that inherits from Computer
public class Box extends Computer{
// Private instance variable to store the amount of memory.
   private String amountOfMemory;
    // Constructor for the Box class that initializes its attributes.
   public Box(String serialNumber, String manufacturer, String colour, String amountOfMemory){
      // Call the constructor of the parent class (Computer) with serialNumber, manufacturer, and colour.
     super(serialNumber, manufacturer, colour);
     this.amountOfMemory = amountOfMemory;
   }
     // Getter method to retrieve the amountOfMemory.
     public String getAmountOfMemory(){
      return amountOfMemory;
     }
      // Override the toString method to provide a custom string representation for Box objects. 
     public String toString(){
        return "Box: " + getSerialNumber() + ", " +  getManufacturer() + ", " + getColour()  + ", " + amountOfMemory;
     }
 }
