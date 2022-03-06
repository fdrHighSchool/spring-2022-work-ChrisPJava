public class StepTracker{
    private int totalS;
    private int stepReq;
    private int activeD;
    private int totalD;

    // Constructor
    public StepTracker(int s) {
        totalS = 0;
        stepReq = s;
        activeD = 0;
        totalD = 0;
    }

    public void addDailySteps(int a) {
        if(a >= stepReq) {
            activeD++;
            totalD++;
            totalS += a;
        }
        else {
            totalS += a;
            totalD++;
        }
    }// end addDailySteps method

    public int activeDays() {
        return this.activeD;
    }// end activeDays

    public double averageSteps() {
        if(this.totalD == 0) {
            return 0.0;
        }
        
        return (double)(this.totalS) / (this.totalD);
    }// end averageSteps method
}// end class
