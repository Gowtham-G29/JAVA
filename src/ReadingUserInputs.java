import java.util.Scanner;
public class ReadingUserInputs {
    public static void main(String[] args){

        int currentYear=2024;

        try{
            System.out.println(getInputFormConsole(currentYear));
        }catch (Exception e){
            System.out.println(getInputFromScanner((currentYear)));
        }


    }


    public static String getInputFormConsole(int currentYear){
        //This only works when we're working in the console or terminal
        String name=System.console().readLine("Hi ,What is yout Name ?");
        System.out.println("Hi "+ name + ", Thank for Everything");
        return " ";
    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner=new Scanner(System.in); //scanner is object from the Scanner class
        System.out.println("Hi , whats your name?");
        String name=scanner.nextLine(); //nextline method is instance method of scanner
        System.out.println("Hi "+name+",Thanks for Listening");
        System.out.println("What year were you are ?");
        String dateOfBirth=scanner.nextLine();

        int age=currentYear-Integer.parseInt(dateOfBirth);
        return "So your are " +age+" years old";
    }



 }
