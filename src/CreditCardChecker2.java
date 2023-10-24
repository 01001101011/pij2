import java.util.Scanner;
public class CreditCardChecker2 {
    int digit;
    boolean pos;

    public int decode(int digit, boolean pos) {
        if (digit % 2 == 1) {
            return digit;
        } else {
            digit = digit * 2;
            if (digit > 10) {
                int digit1 = digit % 10;
                int rem = digit - digit1;
                int digit2 = rem / 10;
                digit = digit1 + digit2;
            }
        }
        return digit;
        }


//    public static void main(String[] args) {
//        int digit = 34;
//        int digit1 = digit % 10;
//        int rem = digit - digit1;
//        int digit2 = rem / 10;
//        System.out.println(digit1);
//        System.out.println(digit2);
//    }


    public static void main(String[] args) {
        CreditCardChecker2 ccc = new CreditCardChecker2();
        boolean even = false;
        System.out.println(ccc.decode(1, even));
        System.out.println(ccc.decode(2, even));
        System.out.println(ccc.decode(3, even));
        System.out.println(ccc.decode(4, even));
        System.out.println(ccc.decode(5, even));
        System.out.println(ccc.decode(6, even));
        System.out.println(ccc.decode(7, even));
        System.out.println(ccc.decode(8, even));
        System.out.println(ccc.decode(9, even));
        even = ! even;
        System.out.println(ccc.decode(1, even));
        System.out.println(ccc.decode(2, even));
        System.out.println(ccc.decode(3, even));
        System.out.println(ccc.decode(4, even));
        System.out.println(ccc.decode(5, even));
        System.out.println(ccc.decode(6, even));
        System.out.println(ccc.decode(7, even));
        System.out.println(ccc.decode(8, even));
        System.out.println(ccc.decode(9, even));
    }
}

