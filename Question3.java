/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/



import java.util.*;
// Creating a class with main method to test class Student and Person
public class Question3{
  // Main method
  public static void main(String[]args){
    // Object to obtain input from the user
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Enter the vehicle manufacturer:");
    String manufacturer = userInput.nextLine();
    System.out.println("Enter the name of the vehicle owner:");
    String owner = userInput.nextLine();
    System.out.println("Enter the owner's gender:");
    String gender = userInput.nextLine();
    System.out.println("Enter the owner's programme of study:");
    String programmeOfStudy = userInput.nextLine();
    System.out.println("Enter the owner's Institution name:");
    String institutionName = userInput.nextLine();
    System.out.println("Enter the owner's hobbies:");
    String hobbies = userInput.nextLine();
    System.out.println("Enter the owner's age:");
    int age = userInput.nextInt();
    userInput.nextLine();
    System.out.println("Enter the number of cylinders in the engine:");
    int numberofCylinders = userInput.nextInt();
    userInput.nextLine();
    System.out.println("Enter the car seating capacity:");
    int seatingCapacity = userInput.nextInt();
    userInput.nextLine();
    System.out.println("Enter the weight of the car:");
    double weight = userInput.nextDouble();
    userInput.nextLine();
    // Creating new object of a Student type
    Student s = new Student(owner, age, gender,institutionName, programmeOfStudy, 2023, hobbies);
    
    // Creating new object of a Vehicle type
    Vehicle vehicle = new Car(numberofCylinders,manufacturer,s,seatingCapacity,weight);
    // Passing the Class Vehicle toString method and print
    System.out.println(vehicle.toString());
  }
}