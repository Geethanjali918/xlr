class PS003 {
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;
    public PS003() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }
    public PS003(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }
    public void computeBowlingAverage() {
        if (wickets <= 0 || runsConceded < 0 || matches < 0 || ballsBowled < 0) {
            System.out.println("Error");
        } else {
            double bowlingAvg = (double) runsConceded / wickets;
            System.out.println("Name: " + name);
            System.out.println("bowling_avg=" + bowlingAvg);
        }
    }
    public void showStatistics() {
        if (wickets < 0 || runsConceded < 0 || matches < 0 || ballsBowled < 0 || (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
        } else {
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + ballsBowled);
            System.out.println("runs_conceded=" + runsConceded);
        }
    }
    public void computeStrikeRate() {
        if (ballsBowled <= 0 || runsConceded < 0 || matches < 0 || wickets < 0 || (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
        } else {
            double strikeRate = (double) runsConceded / ballsBowled;
            System.out.println("Name: " + name);
            System.out.println("Strike_rate=" + strikeRate);
        }
    }
    public static void main(String[] args) {
        PS003 bowler = new PS003("Sachin", 10, 5, 750, 463);
        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}

