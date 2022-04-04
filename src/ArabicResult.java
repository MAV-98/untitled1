public class ArabicResult {
    int res;

    public void calculate(int firstValueArabic, String sign, int secondValueArabic) {
        switch (sign) {
            case ("+") -> res = firstValueArabic + secondValueArabic;
            case ("-") -> res = firstValueArabic - secondValueArabic;
            case ("*") -> res = firstValueArabic * secondValueArabic;
            case ("/") -> res = firstValueArabic / secondValueArabic;
            default -> {
                try {
                    throw new Exception("Invalid sign!");
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    System.exit(0);
                }
            }
        }
        System.out.println(res);
    }
}

