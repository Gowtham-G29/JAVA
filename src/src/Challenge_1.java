public class Challenge_1 {
    public static void main(String[] args){

        double a=20.00d;
        double b=80.00d;

        double result=((a+b)*100.00d)%40.00d;

        System.out.println(result);

        boolean istrue=(result !=0.0) ? false : true;

        System.out.println(istrue);

        if(istrue){
            System.out.println("got some remainder");
        }
    }
}
