package tryWithResources;

import java.util.Scanner;















public class MainTryWithResources {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int i = scanner.nextInt();
            System.out.println("i = " + i);
        }
    }
}
