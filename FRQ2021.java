public class FRQ2021 {
  public static void main(String[] args) {
    int arr[][] = {{0, 1, 1},
                   {0, 3, 2},
                   {1, 1, 2},
                   {4, 0, 6}};

    // Part A of FRQ
    System.out.println(isNonZeroRow(arr, 0));
    System.out.println(isNonZeroRow(arr, 1));

    // Part B of FRQ

    // Tests of the helper method
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
