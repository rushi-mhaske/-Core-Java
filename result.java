
import java.util.Scanner;

public class result {

    public static void main(String[] args) {
        System.out.println("Calculate 5 subject mark");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your TOC mark:");
        Float TOC = sc.nextFloat();

        System.out.println("Enter your operating sysytem mark:");
        Float OS = sc.nextFloat();

        System.out.println("Enter your Machine learning:");
        Float ML = sc.nextFloat();

        System.out.println("Enter your Advance database  management system:");
        Float ADBMS = sc.nextFloat();

        System.out.println("Enter your Human computer interaction:");
        Float HCI = sc.nextFloat();

        System.out.println("Percentage of Examination");
        System.out.println((TOC + OS + ML + ADBMS + HCI) / 5f);

        


    }
}