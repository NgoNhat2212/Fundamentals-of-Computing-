package Baitap;

import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String ten = keyboard.nextLine();
        System.out.println("Nam sinh: ");
        int namsinh = keyboard.nextInt();
        System.out.println("Tuoi: ");
        int tuoi = keyboard.nextInt();
        System.out.println("Gioi tinh: ");
        String gioitinh = keyboard.next();
        System.out.println("Chuyen nganh: ");
        String chuyennganh = keyboard.next();
        System.out.println("GPA: ");
        int GPA = keyboard.nextInt();
        System.out.println("Que quan: ");
        String quequan = keyboard.next();
        System.out.println(ten);
        System.out.println(namsinh);
        System.out.println(tuoi);
        System.out.println(gioitinh);
        System.out.println(chuyennganh);
        System.out.println(GPA);
        System.out.println(quequan);
        
                
        
    }
}
