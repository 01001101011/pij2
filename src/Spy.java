import java.util.Scanner;

public class Spy {
    static int activeSpyCount = 0;
    int id;
    boolean active;

    Spy(int id) {
        this.id = id;
        activeSpyCount++;
        active = true;
        System.out.println("Currently active spies: " + activeSpyCount);
    }

    public void retire() {
        activeSpyCount--;
        active = false;
        System.out.println("Spy " + id + " has retired");
        System.out.println("Currently active spies: " + activeSpyCount);
    }

    public static void main(String[] args) {
        Spy sp1 = new Spy(315);
        Spy sp2 = new Spy(122);
        Spy sp3 = new Spy(101);
        Spy sp4 = new Spy(501);
        Spy sp5 = new Spy(798);
        Spy sp7 = new Spy(199);
        Spy sp8 = new Spy(407);
        sp5.retire();
        sp8.retire();

//        Scanner scanInt = new Scanner(System.in);
//        int x = scanInt.nextInt();
//        Spy spy7 = new Spy(x);

        //Tried to create an array of objects here but received no print statements. Why?
//        Scanner scan = new Scanner(System.in);
//        Spy[] jBond = new Spy[10];
//        for (int i = 0; i < jBond.length; i++) {
//            double x = scan.nextDouble();
//            jBond[i] = new Spy(i * 3);
//        }
    }
}

//        Scanner scanInt = new Scanner(System.in);
//        Scanner scanStr = new Scanner(System.in);
//        System.out.println("Type spy's ID: ");
//        int id = scanInt.nextInt();
//        System.out.println("Is spy still active? (y/n) ");
//        String isActive = scanStr.nextLine();
//        if ("y".equals(isActive)) {
//            Spy spy1 = new Spy(id);
//            Spy spy2 = new Spy






