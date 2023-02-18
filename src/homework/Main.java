package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println(MyArea.areaOfCircle(radius));
    }
}
