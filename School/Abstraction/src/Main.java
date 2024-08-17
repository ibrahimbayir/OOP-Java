public class Main {
    public static void main(String[] args) {
       BaseScoreCalculator baseScoreCalculator = new MenScoreCalculator();
       baseScoreCalculator.gameOver();
       baseScoreCalculator.scoreCalculator();

       BaseScoreCalculator baseScoreCalculator1 = new WomenScoreCalculator();
       baseScoreCalculator1.scoreCalculator();
       baseScoreCalculator1.gameOver();
    }
}