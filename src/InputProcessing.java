import java.util.*;

public class InputProcessing {
    public String sign;
    String[] userInput;
    String [] allValues = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X","1","2", "3", "4", "5", "6", "7", "8", "9", "10"};
    int firstArabicValue;
    int secondArabicValue;
    String firstRomanValue;
    String secondRomanValue;
    boolean checkFirstVar = true;
    boolean checkSecondVar = true;
    boolean checkFromMassOne;
    boolean checkFromMassTwo;
    ArabicResult ar = new ArabicResult();
    RomanResult rr = new RomanResult();
    Scanner sc = new Scanner(System.in);

    public void setUserInput() {
        userInput = sc.nextLine().split(" ");
        if(userInput.length != 3) {
            try {
                throw new Exception("Need two operand's and one operation!");
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }
        }

    }
    public String[] getUserInput() {
        return userInput;
    }
    public void setSign(){
        sign = userInput[1];
    }

    public void checkInputFromUser(String[] userInput) {
        for(String i : allValues){
            checkFromMassOne = Objects.equals(userInput[0], i);
            if(checkFromMassOne){
                break;
            }
        }
        for(String i : allValues){
            checkFromMassTwo = Objects.equals(userInput[2], i);
            if(checkFromMassTwo){
                break;
            }
        }
        if(checkFromMassOne && checkFromMassTwo){
            try{
                firstArabicValue = Integer.parseInt(userInput[0]);
            }catch (NumberFormatException e){
                checkFirstVar = false;
            }
            try {
                secondArabicValue = Integer.parseInt(userInput[2]);
            }catch (NumberFormatException e){
                checkSecondVar = false;
            }
            if(checkFirstVar && checkSecondVar){
                ar.calculate(firstArabicValue, sign, secondArabicValue);
            }else if (checkFirstVar ^ checkSecondVar){
                try{
                    throw new Exception("Use only Arabic or only Roman number's!");
                }catch (Exception e){
                    System.err.println(e.getMessage());
                }
            }
            else {
                firstRomanValue = userInput[0];
                secondRomanValue = userInput[2];
                rr.RomRes(firstRomanValue, sign, secondRomanValue);
            }
        }else {
            try {
                throw new Exception("Use only Arabic number's from 1 to 10 or only Roman number's from I to X");
            }catch (Exception e){
                System.err.println(e.getMessage());
                System.exit(0);
            }
        }
    }
}

