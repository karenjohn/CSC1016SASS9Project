/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/




import java.util.*;
// Creating a class to test classes Computer,Box,Accessory and Screen
public class Question1{
 // Main method
 public static void main(String[] args){
 
  // Defining Instance variables
  String serialNumber;
  String manufacturer;
  String colour;
  String size;
  String amountOfMemory;

 // Creating an arrayList of the Computer's descriptions
 ArrayList<Computer> computerList = new ArrayList<>();
  Scanner userInput = new Scanner(System.in);
  System.out.println("Welcome to Great International Technology");
  System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit ");
 
 // Defining a String variable
   String choice;
   // Introducing a boolean iterating loop that executes as long as the condition stated is true
   while(!(choice=userInput.nextLine()).isEmpty()){
         if(choice.equals("q")){
      break;
     }
     // Introducing an else if statement block that executes incase the while condition wasn't executed
     else if(choice.equals("b")||choice.equals("B")||choice.equals("s")||choice.equals("S")||choice.equals("a")||choice.equals("A")){
      System.out.println("Enter the serial number");
       serialNumber = userInput.nextLine();
      System.out.println("Enter the manufacturer");
       manufacturer = userInput.nextLine();
      System.out.println("Enter the colour");
       colour = userInput.nextLine();
     
      
       if(choice.equals("b") || choice.equals("B")){
         System.out.println("Enter the amount of memory (MB)");
          amountOfMemory = userInput.nextLine();
         computerList.add(new Box(serialNumber, manufacturer, colour, amountOfMemory));
        }
        
        else if(choice.equals("s") || choice.equals("S")){
         System.out.println("Enter the screen size in inches");
          size = userInput.nextLine();
          computerList.add(new Screen(serialNumber, manufacturer, colour, size));
         }
         
        else if(choice.equals("a") || choice.equals("A")){ 
        computerList.add (new Accessory( serialNumber,  manufacturer, colour));
        }
        
      System.out.println("Done");
      System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit ");
     }
     
     /* Introducing an else if statement block that contains other choices apart from the ones in the 
     former else if block that give a condition of deleting the list that has the serial Number athat 
     matches serial Number inserted by the user*/
     else if(choice.equals("d")){
      System.out.println("Enter the serial number");
      String serialNumberToDelete = userInput.nextLine();
      boolean deleted = false;
      for (int i=0; i<computerList.size(); i++){
       Computer computer = computerList.get(i);
       if(computer.getSerialNumber().equals(serialNumberToDelete)){
         computerList.remove(i);
         deleted = true;
         break;
       }
      }
      
      /* If condition that prints Not found incase the inserted serial Number by the user doesn't
       match the serial Number of any item in the list*/
      if(!deleted){
       System.out.println("Not found");
       System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit ");

      }// else do otherwise
       else{
        System.out.println("Done");
        System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit ");
       }
     }
     
     else if (choice.equals("l")){
       for(Computer computer: computerList){
        System.out.println(computer);
       }
       System.out.println("Done");
       System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit ");
     }
  }   
 } 
}   

