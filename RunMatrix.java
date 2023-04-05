import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Matrix m = new Matrix();   // allows user to assign size of matrix
    m.populateMatrixSample();  //Populates a sample size of matrx assigned with zeros
    m.printMatrix();           //Prints out Zero matrix to user
    m.populateMatrix();        //Repopulates matrix starting from 1 - n
    m.printMatrix();           //Prints out populates matrix
    m.flipMatrix();            //Flips matrix on its positive diagonals while keeping values on the diagonal
    m.printMatrix();           // Prints out newly flipped matrix
  }
}
