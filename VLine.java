/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/

 
public class VLine extends VectorObject {
  
  // Instance Variables
   private int len;
   
   // Constructor for VLine class
   public VLine(int Id, int x, int y , int len){
   
      super(Id, x, y);
      this.len = len;
   }
   
   
   // Method to draw a vertical line represented by a star characters in a 2D char matrix
   public void draw ( char [][] matrix ){
       
       // Iterating loop for the items in the line of the matrix
        for (int i = y; i < y + len; i++){
          matrix[i][x] = '*';
       }
       
        setNewCoords(x,y);
   }
   
    // Method to convert the first column of the 2D char matrix to a string representation
   public String toString ( char [][] matrix ){
      
       String print = "";
       // Iterating loop for the items in the line of the matrix
       for (int i = 0; i < 20; i++  ){
       
            print += matrix [i][0];
       }
       
       return print;
   }

}