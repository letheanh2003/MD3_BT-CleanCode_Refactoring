public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore=0;
        boolean isEqual = scorePlayer1 == scorePlayer2;
        if (isEqual)
        {
            final int Love = 0;
            final int Fifteen =  1;
            final int Thirty = 2;
            final int Forty = 3;
            switch (scorePlayer1)
            {
                case Love:
                    score = "Love-All";
                    break;
                case Fifteen:
                    score = "Fifteen-All";
                    break;
                case Thirty:
                    score = "Thirty-All";
                    break;
                case Forty:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
        else {
            boolean isPlayer1ScoreAbove4 = scorePlayer1 >= 4;
            boolean isPlayer2ScoreAbove4 = scorePlayer2 >= 4;
            if (isPlayer1ScoreAbove4 || isPlayer2ScoreAbove4)
            {
                int minusResult = scorePlayer1-scorePlayer2;
                if (minusResult==1) score ="Advantage player1";
                else if (minusResult ==-1) score ="Advantage player2";
                else if (minusResult>=2) score = "Win for player1";
                else score ="Win for player2";
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = scorePlayer1;
                    else { score+="-"; tempScore = scorePlayer2;}
                    final int Love = 0;
                    final int Fifteen = 1;
                    final int Thirty = 2;
                    switch(tempScore)
                    {
                        case Love:
                            score+="Love";
                            break;
                        case Fifteen:
                            score+="Fifteen";
                            break;
                        case Thirty:
                            score+="Thirty";
                            break;
                        case 3:
                            score+="Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
}
