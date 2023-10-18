import java.util.Scanner;
public class d6e2 {
    public static void main(String[] args) {
        int x;
        int i = 0;
        int distinction = 0;
        int merit = 0;
        int pass = 0;
        int fail = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Input a mark: ");
            x = scan.nextInt();
            if (x >= 70 && x <= 100) {
                distinction++;
            } else if (x <= 69 && x >= 60) {
                merit++;
            } else if (x <= 59 && x >= 50) {
                pass++;
            } else if (x <= 49 && x >= 0) {
                fail++;
            }
        } while (x != -1; i++);
    }

    public

}