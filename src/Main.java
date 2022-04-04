public class Main {
    public static void main(String[] args) {
        InputProcessing ip = new InputProcessing();
        ip.setUserInput();
        ip.setSign();
        ip.checkInputFromUser(ip.getUserInput());
        System.out.println();
    }
}

