 /*KAREN JOHN
  JHNKAR016
  28/9/2023
*/

 
 
 import java.lang.Math; 
// Creating a PtLine class that inherits from VectorObject
public class PtLine extends VectorObject {

   // Instance variables
   private int x;
   private int y;
   private int bx;
   private int by;
   
   
   // Constructor for PtLine class  
   public PtLine(int Id, int x, int y , int bx, int by){
      super(Id, x, y); 
      this.bx = bx;
      this.by = by;
      this.x = x;
      this.y = y;
   }
   

  
   // Method to draw a line represented by a star characters in a 2D char matrix
   public void draw ( char [][] matrix ){
     
     int ys = 0;
     int have = 0;
     // Check if the line is slope,the difference in y is greater than the difference in x
     boolean steep = Math.abs(by-y)>Math.abs( bx-x);
     if (steep){
         have = x;
         x = y;
         y = have;  
         
         have = bx; 
         bx = by;
         by = have;  
     }
     
     // If condition for x greater than bx then enable swapping 
     if (x > bx){
         have = x; 
         x = bx;
         bx = have;
         
         have = y; 
         y = by;
         by = have;
           }
     
     // Determine if the line is moving up or down in the y direction
     if(y < by){
         ys = 1;
     }
     else{
     
        ys = -1;
     }
     
     // Calculate the gradient m and initialize variables for drawing
     int m = (Math.abs(by-y))/(Math.abs(bx-x));
     int Y = y;
     double error = 0;
     
     // Loop through the x coordinates to draw the line
     for (int X = x; X < bx+1; X++){
         if (steep){
            
            matrix[X][Y] = '*';
         }
         
         else{
           
           matrix[Y][X] = '*'; 
            
         }
         
         error -= m;
         if (error>0.0){
            Y+=ys;
            error-=1.0;
         }
     }
      // Update the coordinates in the parent class VectorObject
      setNewCoords(x,y);
   }
   
   
  // Method to convert the 2D char matrix to a string representation 
  public String toString ( char [][] matrix ){
      
       String print = " ";
       
       for (int j = 0; j < 20; j++){
       
         for (int i = 0; i < 20; i++  ){
         
            print+= matrix [i][j];
          }
          print+="\n";
       }
       
       return print.toString();
   }
    
   

}