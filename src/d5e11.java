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
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        String[] name = new String[10];
        int[] id = new int[10];
        String dummyName;
        int dummyId;
        int lenArray = id.length;
        int i = 0;
        boolean f = false;
        do {
            System.out.println("Please enter name: ");
            dummyName = scanStr.nextLine();
            System.out.println("Please enter ID number:");
            dummyId = scanInt.nextInt();
            int lenNameInput = dummyName.length();
            //if ("".equals(lenNameInput)) break;
            if ("".equals(dummyName)) break;
            if (dummyId == 0) break;
            if (i < lenArray) {
                name[i] = dummyName;
                id[i] = dummyId;
            } else
            if (i == lenArray) {
                name = addStr(name, dummyName);
                id = addInt(id, dummyId);
                lenArray++;
            }
            i++;
        } while (true);

        for (int j = 0; j < id.length; j++) {
            if ("S".equals(name[j].substring(0, 1))) {
                System.out.println("Name: " + name[j] + ", ID:" + id[j]);
            }
            if (id[j] % 2 == 0) {
                System.out.println("Name: " + name[j] + ", ID:" + id[j]);
            }
        }
    }
}