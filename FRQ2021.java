import java.util.*;

public class FRQ2021 {
  public static void main(String[] args) {
    int arr[][] = {
                   {2, 1, 0},
                   {1, 3, 2},
                   {0, 0, 0},
                   {4, 5, 6}
                  };

    // Part A of FRQ
    System.out.println(isNonZeroRow(arr, 0));
    System.out.println(isNonZeroRow(arr, 3));

    // Part B of FRQ
    System.out.println(Arrays.deepToString(resize(arr)));

    // Helper method test
    System.out.println(numNonZeroRows(arr));
  } // end main method

  public static int numNonZeroRows(int[][] array2D) {
    int nonZeroRow = 0;
    int count = 0;

    for(int r = 0; r < array2D.length; r++) {
      for (int c = 0; c < array2D[0].length; c++) {
        if(array2D[r][c] > 0) {
          nonZeroRow++;
          if(nonZeroRow >= 3) {
            count++;
          }
        }
      }
      nonZeroRow = 0;
    }

    return count;
  } // end numNonZeroRows method

  public static int[][] resize(int[][] array2D) {
    int[][] newArr = new int[numNonZeroRows(array2D)][array2D[0].length];
    int rows = 0;

    for(int i = 0; i < array2D.length; i++) {
      if((isNonZeroRow(array2D, i))) {
        newArr[rows] = array2D[i];
        rows++;
      }
    }

    return newArr;
  } // end resize method

  public static boolean isNonZeroRow(int[][] array2D, int r) {
    int l = 0;

    for (int c = 0; c < array2D[0].length; c++) {
      if(array2D[r][c] == 0) {
        l++;
      }
    }

    if(l > 0) {
      return false;
    }
    else {
      return true;
    }
  } // end isNonZeroRow method
} // end class
