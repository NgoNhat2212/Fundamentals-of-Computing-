package Baitap7;
import java.util.Scanner;
import java.util.Arrays;
public class Baitap7 {
    public static void importdata(float[] a) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("number " + (i + 1) + " : ");
            a[i] = keyboard.nextInt();
        }
    }
    public static void printdata(float[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static float findmax2(float[] a) {
        Arrays.sort(a);
        return a[a.length - 2];
    }
    public static void deleteOddNumber(float[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] = 0;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So phan tu la: ");
        int n = scanner.nextInt();
        float[] number = new float[n];
        importdata(number);
        System.out.print("Mang sau khi nhap: ");
        printdata(number);
        System.out.println("Phan tu lon thu 2 cua mang la: " + findmax2(number));
        deleteOddNumber(number);
    }
}
