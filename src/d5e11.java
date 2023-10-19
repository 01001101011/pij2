import java.util.Scanner;

public class d5e11 {
    public static int[] addInt(int[] oldId, int extraId) {
        int newLen = oldId.length + 1;
        int[] id = new int[newLen];
        for (int i = 0; i < newLen; i++) {
            if (i <= newLen - 2) {
                id[i] = oldId[i];
            } else {
                id[i] = extraId;
            }
        }
        return id;
    }

    public static String[] addStr(String[] oldName, String extraName) {
        int newLen = oldName.length + 1;
        String[] name = new String[newLen];
        for (int i = 0; i < newLen; i++) {
            if (i <= newLen - 2) {
                name[i] = oldName[i];
            } else {
                name[i] = extraName;
            }
        }
        return name;
    }

    public static void main(String[] args) {
        String[] name = {"a", "b", "c"};
        String y = "d";
        int[] id = {1, 2, 3};
        int x = 9;
        name = addStr(name, y);
        id = addInt(id, x);
        for (int i = 0; i < 4; i++) {
            System.out.println(name[i]);
            System.out.println(id[i]);
        }

    }

//    public static void main(String[] args) {
//        Scanner scanStr = new Scanner(System.in);
//        Scanner scanInt = new Scanner(System.in);
//        String[] name = new String[10];
//        int[] id = new int[10];
//
//        boolean f = false;
//        int i = 0;
//
//        do {
//            System.out.println("please enter name: ");
//            name[i] = scanStr.nextLine();
//            System.out.println("PLEASE ENTER ID:");
//            id[i] = scanInt.nextInt();
//
//            //f = " ".equals(name[i]);
//            int len = name[i].length();
//            if (len == 0) f = true;
//            i++;
//        } while (f == false);
//        for (int i=0; i < 10; i++) {
//            System.out.println(name[i]);
//            System.out.println(id[i]);
//        }
//    }
}
