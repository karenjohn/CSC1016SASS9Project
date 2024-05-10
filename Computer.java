/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/


public class Computer{
 // Private instance variables to store the computer's serial number, manufacturer, and color.
 private String serialNumber;
 private String manufacturer;
 private String colour;
   // Constructor for the Computer class that initializes its attributes.
   public Computer(String serialNumber, String manufacturer, String colour){
      this.serialNumber=serialNumber;
      this.manufacturer=manufacturer;
      this.colour=colour;
   }
   // Getter method to retrieve the serial number.
   public String getSerialNumber(){
    return serialNumber;
   }
   // Setter method to set the serial number.
   public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
   }
    // Getter method to retrieve the manufacturer. 
   public String getManufacturer(){
    return manufacturer;
   }
   // Setter method to set the manufacturer.
   public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
   }
   // Getter method to retrieve the color.
   public String getColour(){
    return colour;
   }
   // Setter method to set the color.
   public void setColour(String colour) {
    this.colour = colour;
   }
   // toString method that returns a string representation of the Computer object.
   public String toString(){
     return serialNumber + ", " +  manufacturer + ", " +colour ;
   }
 }
 
 
  
    
      