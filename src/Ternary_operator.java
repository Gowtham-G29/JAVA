public class Ternary_operator {
    public static void main (String[] args){

        //ternary operator --> similar like if else
         String makerOfCar="volkswagen";
         boolean isDomestic= makerOfCar == "volkswagen" ? false : true;

         if(!isDomestic){
             System.out.println("It is a domestic Car");
         }

         String s=(isDomestic) ? "This car is domestic" : "This car is not domestic";
         System.out.println(s);
    }
}
