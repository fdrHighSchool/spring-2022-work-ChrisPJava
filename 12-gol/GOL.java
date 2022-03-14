import java.util.Arrays;
import java.lang.Thread;
import java.util.*;

public class GOL {
    public static void main(String[] args) {
        String[][] cellBoard = fillBoard(makeBoard());
        Scanner s = new Scanner(System.in);
        GOLCell cell = new GOLCell(0, 0);
        boolean select = false;
        boolean run = true;
        double ran = 0.0;
        int count = 0;

        System.out.println(Arrays.deepToString(cellBoard) + "\n");

        while(run) {
            for(int j = 0; j < cellBoard.length; j++) {
                for(int i = 0; i < cellBoard[0].length; i++) {
                    ran = Math.random();
                    select = ran <= 0.490 ? true : false;

                    // Breaking the loop if it's full
                    if(cellBoard[j][i] == "[0]") {
                        count++;
                        if(count >= 99) {
                            run = false;
                        }
                    }

                    if(cellBoard[j][i] == "[ ]" && select) {
                        cellBoard[j][i] = "[0]";
                    } 
                    
                }
            }

            count = 0;
            System.out.println(Arrays.deepToString(cellBoard) + "\n");
        }
    }// end main method

    public static String[][] makeBoard() {
        String[][] board = new String[10][10];

        for(int j = 0; j < board.length; j++) {
            for(int i = 0; i < board[0].length; i++) {
                board[j][i] = "[ ]";
            }
        }

        return board;
    }// end makeBoard method

    public static String[][] fillBoard(String[][] arr) {
        for(int j = 0; j < arr.length; j++) {
            for(int i = 0; i < arr[0].length; i++) {
                GOLCell createCell = new GOLCell(j, i);
                arr[j][i] = createCell.cellForm();
            }
        }

        return arr;
    }// end fillBoard method
}// end class
