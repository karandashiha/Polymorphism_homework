package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Device A: ");
        int deviceA = scanner.nextInt();
        System.out.print("Device B: ");
        int deviceB = scanner.nextInt();
        System.out.print("Enter constant: ");
        int constant = scanner.nextInt();

        Device devA = new DevA(deviceA, deviceA);
        Device devB = new DevB(deviceA, deviceB, constant);

        int resultA = devA.getResult();
        int resultB = devB.getResult();
        System.out.println("Result device А: " + resultA);
        System.out.println("Result device B: " + resultB);

        scanner.close();
    }
}
