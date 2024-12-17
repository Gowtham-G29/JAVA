public class Methods {
    public static void main(String[] args){

        int result1=calculateScore( true,800,5,100);
        int result2=calculateScore(true,10000,8,200);
        System.out.println("The Highest Score 1 and 2 is: "+result1 +" "+result2);
    }


    public static int calculateScore(boolean gameOver,int score,int levelcompleted,int bonus){
        int finalScore=score;
        if(gameOver){
            finalScore+=(levelcompleted*bonus);
            finalScore+=1000;
//            System.out.println("Your final Score was "+finalScore);
        }
        return finalScore;

    }



}
