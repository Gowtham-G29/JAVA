public class Method_Overloading {

    public static void main(String[] args) {


       System.out.println("New score is "+  calculateScore("Gowtham",500));

       calculateScore(75);
       calculateScore("Ranju",100000);
       calculateScore();

    }

    public static int calculateScore(String playerName,int score){
        System.out.println("player "+playerName+" scored "+score+" points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+" points");
        return score*1000;
    }

    public static void calculateScore(){
        System.out.println("No player scored  points");
    }
}
