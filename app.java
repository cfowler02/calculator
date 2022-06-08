import java.util.Scanner;

public class app{
    static final Scanner inputScanner = new Scanner(System.in);
    
    private static String getString(String prompt) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(prompt);
        String gotString = inputScanner.nextLine();
        return gotString;
    }

    private static double getDouble(String prompt) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(prompt);
        double gotDouble = inputScanner.nextDouble();
        return gotDouble;
    }

    private static void calculator(boolean cont){
        while(cont == true){
            String prompt1 = "enter a number: ";
            double num1 = getDouble(prompt1);
            double num2 = getDouble(prompt1);
            String prompt2 = "You want to add " + String.valueOf(num1) + " and " + String.valueOf
            (num2);
            String prompt3 = "You want to subtract " + String.valueOf(num1) + " and " + String.valueOf
            (num2);
            String prompt4 = "You want to multiply " + String.valueOf(num1) + " and " + String.valueOf
            (num2);
            String prompt5 = "You want to divide " + String.valueOf(num1) + " and " + String.valueOf
            (num2);
            String prompt6 = "Enter yes if you would like to continue, enter anything else if you would like to exit";
            System.out.println(prompt2);
            System.out.println(calculator.add(num1,num2));
            System.out.println(prompt3);
            System.out.println(calculator.subtract(num1,num2));
            System.out.println(prompt4);
            System.out.println(calculator.multiply(num1,num2));
            System.out.println(prompt5);
            System.out.println(calculator.divide(num1,num2));
            String contStr = getString(prompt6);
            if(contStr != "yes" && contStr != "Yes" && contStr != "YES"){
                cont = false;
                System.out.println((contStr != "yes" && contStr != "Yes" && contStr != "YES"));
                System.out.println(cont);
            }
        }
    }

    public static void main(String[] args){
        boolean cont = true;
        calculator(cont);    
    }
}