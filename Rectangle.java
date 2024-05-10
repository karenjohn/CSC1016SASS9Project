/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/

// Creating Class Rectangle that inherits from VectorObject
public class Rectangle extends VectorObject {
 
  // Instance Variables
   private int xlen;
   private int ylen;

   // Constructor for Rectangle class
   public Rectangle(int Id, int x, int y , int xlen, int ylen){
      // Call the constructor of the parent class VectorObject
      super(Id, x, y); 
      
      this.xlen = xlen;
      this.ylen = ylen;
      
   }
   
    // Method to draw a rectangle represented by a star characters in a 2D char matrix
   public void draw ( char [][] matrix ){
       
       
       for (int i = y; i < ylen + y; i++  ){
       
         for (int j = x; j < xlen + x; j++  ){
          matrix[j][i] = '*';
          
          }
       }
       
       setNewCoords(x,y);
   }

   // Method to convert the entire 2D char matrix to a string representation
   public String toString ( char [][] matrix ){
      
       String print = "";
       
       for (int i = 0; i < 20; i++  ){
       
         for (int j = 0; j < 20; j++  ){
         
            print = print + matrix [i][j];
          }
          print = print + "\n";
       }
       return print;       
   }

}