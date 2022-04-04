public class RomanResult {
    public String resultValueRoman = "";
    public void RomRes(String firstRomanValue, String sign, String secondRomanValue){
        int res = 0;
        int firstValue = 0;
        int secondValue = 0;
        switch (firstRomanValue) {
            case "I" -> firstValue = 1;
            case "II" -> firstValue = 2;
            case "III" -> firstValue = 3;
            case "IV" -> firstValue = 4;
            case "V" -> firstValue = 5;
            case "VI" -> firstValue = 6;
            case "VII" -> firstValue = 7;
            case "VIII" -> firstValue = 8;
            case "IX" -> firstValue = 9;
            case "X" -> firstValue = 10;
        }
        switch (secondRomanValue) {
            case "I" -> secondValue = 1;
            case "II" -> secondValue = 2;
            case "III" -> secondValue = 3;
            case "IV" -> secondValue = 4;
            case "V" -> secondValue = 5;
            case "VI" -> secondValue = 6;
            case "VII" -> secondValue = 7;
            case "VIII" -> secondValue = 8;
            case "IX" -> secondValue = 9;
            case "X" -> secondValue = 10;
        }
        switch (sign) {
            case ("+") -> res = firstValue + secondValue;
            case ("-") -> res = firstValue - secondValue;
            case ("*") -> res = firstValue * secondValue;
            case ("/") -> res = firstValue / secondValue;
            default -> {
                try {
                    throw new Exception("Invalid sign!");
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    System.exit(0);
                }
            }
        }
        if (res < 1) {
            try {
                throw new Exception("Result is incorrect! Can't be negative!");
            } catch (Exception e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }

        }

        /*M 1000   CM 900   D 500    CD 400  C 100  XC 90
          X 10     IX   9   V 5      IV 4    L 50   XL 40
          I 1  */

        while (res >= 1000) {
            resultValueRoman += "M";
            res -= 1000;
        }
        while (res >= 900) {
            resultValueRoman += "CM";
            res -= 900;
        }
        while (res >= 500) {
            resultValueRoman += "D";
            res -= 500;
        }
        while (res >= 400) {
            resultValueRoman += "CM";
            res -= 400;
        }
        while (res >= 100) {
            resultValueRoman += "C";
            res -= 100;
        }
        while (res >= 90) {
            resultValueRoman += "XC";
            res -= 90;
        }
        while (res >= 50) {
            resultValueRoman += "L";
            res -= 50;
        }
        while (res >= 40) {
            resultValueRoman += "XL";
            res -= 40;
        }
        while (res >= 10) {
            resultValueRoman += "X";
            res -= 10;
        }
        while (res >= 9) {
            resultValueRoman += "IX";
            res -= 9;
        }
        while (res >= 5) {
            resultValueRoman += "V";
            res -= 5;
        }
        while (res >= 4) {
            resultValueRoman += "IV";
            res -= 4;
        }
        while (res >= 1) {
            resultValueRoman += "I";
            res -= 1;
        }
        System.out.println(resultValueRoman);
    }
}

