public class if_Statement {
    public static void main(String[] args){
        System.out.println("Hello Gowtham");

        boolean isAlien=false;
        if(isAlien == false ){
            System.out.println("It is not an alien");
        }

        int topScore=80;
        if(topScore==100){
            System.out.println("You got the high score!");
        }

        int secondTopScore=60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top Score and less than 100");
        }

        if((topScore>90)||(secondTopScore<=90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue=50;
        if(newValue==50){
            System.out.println("Its Okay");
        }

        boolean isCar=false;
        if(!isCar){
            System.out.println("This not suppose to happened");
       }
    }
}
