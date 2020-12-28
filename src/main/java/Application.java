import utils.StringReverser;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in some string:");
        String str = scanner.nextLine();

        if (reverser.validateInput(str)){
            System.out.println("Your reversed string:");
            System.out.println(reverser.stringReverseLazy(str));
        }
    }
}
