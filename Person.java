/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/


// Creating class person
public class Person{
 //Instance variables
  private int age;
  private String gender;
  private String name;

  // Class constructor
  public Person(String name,int age,String gender){
   this.name = name;
   this.age = age;
   this.gender = gender;
  }
  
  // Copy constructor
  public Person(Person p){
   name = p.name;
   age = p.age;
   gender = p.gender; 
  }
  
  // Method to obtain name
   public String getName(){
    return this.name;
   }
  // Method to set name
   public void setName(String name){
    this.name = name;
   }
   
   // Method to obtain age
   public int getAge(){
    return this.age;
   }
   
   // Method to set age
   public void setAge(int age){
    this.age = age;
   }
   
   // Method to obtain gender
   public String getGender(){
    return this.gender;
   }
   
   // Method to set gender
   public void setGender(String gender){
    this.gender = gender;
   }
 }