/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/

// Class Accessory that inherits from Computer
public class Accessory extends Computer {
   // Constructor for the Accessory class that initializes its attributes
    public Accessory(String serialNumber, String manufacturer, String colour) {
    // Call the constructor of the parent class (Computer) with serialNumber, manufacturer, and colour.
       super(serialNumber, manufacturer, colour);
    }
    // Override the toString method to provide a custom string representation for Accessory objects.
    public String toString(){
             return "Accessories: " + getSerialNumber() + ", " + getManufacturer() + ", " + getColour();
     }
}
            