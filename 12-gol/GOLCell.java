public class GOLCell {
    private boolean alive;
    private int x;
    private int y;

    // Constructor
    public GOLCell(int xp, int yp) {
        this.x = xp;
        this.y = yp;
        this.alive = false;
    }// end GOLCell method

    public String cellForm() {
        this.alive = createAlive() <= 0.20 ? true : false;
        if(this.alive) {
            return "[0]"; // Alive
        }
        else {
            return "[ ]"; // Dead
        }
    }// end cellForm method

    public boolean borderCells(String[][] arr) {
        for(int r = 1; r < arr.length-1; r++) {
            for(int c = 1; c < arr[0].length-1; c++) {
                if(arr[r][c] == "[0]") {
                    return true;
                }
            }
        }

        return false;
    }// end borderCells method

    public int getX() {
        return this.x;
    }// end getX method

    public int getY() {
        return this.y;
    }// end getY method

    public boolean getAlive() {
        return this.alive;
    }// end getAlive method

    public double createAlive() {
        double rant = Math.random();
        return rant;
    }// end createAlive method
}// end class

