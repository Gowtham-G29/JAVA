public class Method_challenge1 {
    public static void main(String[] args) {
        int highScorePosition=calculateHighscorePosition(100);
        displayHighScorePosition("Gowtham",highScorePosition);

    }
    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName+ " Managed to get into position "+highScorePosition+" on the high score list");
    }

    public static int calculateHighscorePosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }else if(playerScore>500){
            return 2;
        } else if (playerScore>=100&&playerScore<500) {
            return 3;
        }else {
            return 4;
        }
    }
}
