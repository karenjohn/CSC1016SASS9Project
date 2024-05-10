/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/

// Student class that inherits from Person class
public class Student extends Person{
  
  //Instance variables
  private int yearOfStudy;
  private String hobbies;
  private String nameOfInstitution;
  private String programOfStudy;
  
  // Student class constructor 
  public Student(String name, int age, String gender, String nameOfInstitution, String programOfStudy, int yearOfStudy, String hobbies){
   // Inheriting form the base class
   super(name,age,gender);
   this.nameOfInstitution = nameOfInstitution;
   this. programOfStudy = programOfStudy;
   this. yearOfStudy = yearOfStudy;
   this. hobbies = hobbies;
  }
  
  // Copy constructor
  public Student(Student t){
   super(t);
   nameOfInstitution = t.nameOfInstitution;
   programOfStudy = t.programOfStudy;
   yearOfStudy = t.yearOfStudy;
   hobbies = t.hobbies;
  }
  
  // Method to obtain the year of study
  public int getYearOfStudy(){
    return yearOfStudy;
  } 
  
  // Method to obtain hobbies  
  public String getHobbies(){
    return hobbies;
  }
  
  // Method to obtain name of institution
  public String getNameOfInstitution(){
    return nameOfInstitution;
  }  
  
  // Method to obtain program of study
  public String getProgramOfStudy(){
    return programOfStudy;
  }  
  
  //Method to set hobbies
  public void setHobbies(String hobbies){
    this.hobbies = hobbies;
  } 
  
  //Method to set name of institution 
  public void setNameOfInstitution(String nameOfInstitution){
     this.nameOfInstitution = nameOfInstitution;
  }
  
  // Method to set program of study
  public void setProgramOfStudy(String programOfStudy){
     this.programOfStudy = programOfStudy;
  }
  
  // Method to set year of study
  public void setYearOfStudy(int yearOfStudy){
      this.yearOfStudy = yearOfStudy;
  }
}
  