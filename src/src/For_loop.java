public class For_loop {
    public static void main(String[] args){
        int N=5;
        for(int i=0;i<N;i++) {
            System.out.println("10000 at "+ i + "% interest="+caluculateInterest(10000.0,i));
        }

    }

    public static double caluculateInterest(double amount,double interestRate){
        return (amount*(interestRate/100));
    }

}
