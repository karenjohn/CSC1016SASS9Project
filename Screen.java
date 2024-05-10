/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/

//Class Screen that inherits from Computer
public class Screen extends Computer{
 // Private instance variable to store the size.
    private String size;
    // Constructor for the Screen class that initializes its attributes.
  public Screen(String serialNumber, String manufacturer, String colour, String size){
     // Call the constructor of the parent class (Computer) with serialNumber, manufacturer, and colour.
    super(serialNumber, manufacturer, colour);
     this.size = size;
   }
    // Getter method to retrieve the size.
    public String getSize(){
       return size;
     }
     // Override the toString method to provide a custom string representation for Screen  objects.
     
     public String toString(){
            return super.toString() + ", " + size;
     }
}
