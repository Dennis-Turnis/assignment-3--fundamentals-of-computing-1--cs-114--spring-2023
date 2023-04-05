import java.util.Scanner;

public class Matrix {
  private int [][]matrix; //assigns matrix as private to prevent unauthorized changes

  public Matrix(){
    int size;

    Scanner scan = new Scanner(System.in);
    System.out.print(" Enter Size of Matrix: "); //Prompts user to enter size of matrix
    size = scan.nextInt();                       // assigns user input to size as an integer
    System.out.println();
    System.out.println("Matrix size assigned is: " + size + "X" + size);
    matrix = new int [size][size];               //assigns integer size to row and column for matrix
  }

  public void populateMatrixSample(){            // function populates a matrix size sample with zeros
    int rowValue;
    int colValue;

    System.out.println("Printing Matrix Sample .... ");

    for(rowValue = 0; rowValue < matrix.length; rowValue++){
      for(colValue = 0; colValue < matrix.length; colValue++){
        matrix[rowValue][colValue] = 0;
      }
    }
  }

  public void populateMatrix(){                   //Function populates matrix from 1 - n
    int rowValue;
    int colValue;
    int value = 1;
    System.out.println("Populating matrix .... ");

    //Performing operation to fill in matrix wth values 1-n
    for(rowValue = 0; rowValue < matrix.length; rowValue++){
      for(colValue = 0; colValue < matrix.length; colValue++){
        matrix[rowValue][colValue] = value++;
      }
    }

  }


  //Printing out the matrix
  public void printMatrix(){
    int rowValue;
    int colValue;
    int rowNum = 0;
    int colNum = matrix.length - 1;
  //rowNum and colNum allows us to assign row and column positions  
    System.out.println();

    for(rowValue = 0; rowValue < matrix.length; rowValue++){
      for(colValue = 0; colValue < matrix.length; colValue++){
        if(rowValue == rowNum && colValue == colNum){
          System.out.print("\u001B[33m"); 
          // Prints out a Yellow ANSi color when row value = row number and  column value = column number
        }

        System.out.printf("%4d ", matrix[rowValue][colValue]); // prints out row and column values with a width spacing of 4
        System.out.print("\u001B[0m"); // prints out values that dont agree with logic as white
      }
      rowNum++; // incrementing row number by 1
      colNum--; // decrementing colomn number by 1
      System.out.println();
    }
    System.out.println();
  }

  //Interchanging row values and column values
  private void swap(int rowNum, int colNum, int x2, int y2){
    int temp = matrix[rowNum][colNum];       // Assigns original matrix values to temp (temporary)
    matrix[rowNum][colNum] = matrix[y2][x2]; // swaps row to column and column to row and assigns it as original matrix
    matrix[y2][x2] = temp;                   // replaces original matrix with new matrix values
  }

  //Flipping matrix along its diagonal axis
  public void flipMatrix(){
    int rowValue;
    int colValue;
    int matrixSize = matrix.length;
    System.out.println("Flipping matrix on diagonal axis ...");

    //performing matrix flipping operation
    for(rowValue = 0; rowValue < matrixSize; rowValue++){
      for(colValue = 0; colValue < matrixSize - 1 - rowValue; colValue++){
        swap(rowValue, colValue, matrixSize-1-colValue, matrixSize-1-rowValue);
      }
    }
  }
}
 