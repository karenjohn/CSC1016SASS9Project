/*KAREN JOHN
  JHNKAR016
  28/9/2023
*/

// Class HLine that inherits from Class VectorObject 
public class HLine extends VectorObject {
   // Instance Variable
   private int len;
    
   // Class constructor  
   public HLine (int Id, int x, int y , int len){
      super(Id, x, y);  
      this.len = len;
   }
   
   
   // Overridden method from the parent class
   public void draw ( char [][] matrix ){
       
       // Iterating loop for the items in the row of the matrix
       for (int i = x; i < x + len; i++  ){
       
          matrix[y][i] = '*';
       }
       
        setNewCoords(x,y);
   }
   
   // Method to convert the first row of the 2D char matrix to a string representation

   public String toString ( char [][] matrix ){
      
       String print = "";
       // Iterating loop for the items in the line of the matrix
        for (int j = 0; j < 20; j++  ){
       
            print+= matrix [0][j];
       }
       return print;
       
   }
}