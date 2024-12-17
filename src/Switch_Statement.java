public class Switch_Statement {
    public static void main(String[] args){

        int switchValue=5;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            default:
                System.out.println("error");
                break;
        }
        String month="April";
        System.out.println(month+" is in the "+getQuarter(month)+" quarter");
    }

    public static String getQuarter(String month){

       return switch (month){
            case "January", "Febrauary","March"-> {
                yield "1st";
            }
            case "April","May","June"->{
                yield  "2nd";
            }
            case "July","August","September"->{
                yield  "3rd";
            }
            case "October","November","December"->{
                yield  "4th";
            }
            default -> {
                yield  "Bad";
            }

        };
    }

}
