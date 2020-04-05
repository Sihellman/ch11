import java.util.Scanner;
public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println("enter an integer");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("the digits in that number are:");
        displayAsWords(number);
        System.out.println();

        System.out.println("if you add ten to that number, ");
        System.out.println("the digits in the new number are:");
        number = number + 10;
        displayAsWords(number);
        System.out.println();
    }
    //precondition: number >= 0
    //displays the digits in number as words
    public static void displayAsWords(int number){
        if (number < 10){
            System.out.print(getWordFromDigit(number) + " ");
        }
        else{//number has two or more digits
            displayAsWords(number / 10);
            System.out.print(getWordFromDigit(number) + " ");
        }
    }
    //precondition: 0<= digit <= 9
    //returns the word for the argument digit
    private static String getWordFromDigit(int digit){
        String result = null;
        switch (digit){
            case 0: result = "zero"; break;
            case 1: result = "one"; break;
            case 2: result = "two"; break;
            case 3: result = "three"; break;
            case 4: result = "four"; break;
            case 5: result = "five"; break;
            case 6: result = "six"; break;
            case 7: result = "seven"; break;
            case 8: result = "eight"; break;
            case 9: result = "nine"; break;
            default:{
                System.out.println("fatal error");
                System.exit(0);
            }
        }
        return result;
    }
}
